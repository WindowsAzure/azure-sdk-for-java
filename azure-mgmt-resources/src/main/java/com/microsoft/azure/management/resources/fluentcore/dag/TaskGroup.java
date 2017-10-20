/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.resources.fluentcore.dag;

import rx.Observable;
import rx.functions.Func0;
import rx.functions.Func1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Type representing a group of task entries, each entry holds a {@link TaskItem} and associated
 * dependency information.
 *
 * @param <ResultT> type of the result returned by the tasks in the group
 * @param <TaskT> type of the tasks in the group that can return a value
 */
public class TaskGroup<ResultT, TaskT extends TaskItem<ResultT>>
        extends DAGraph<TaskT, TaskGroupEntry<ResultT, TaskT>> {
    /**
     * The proxy task group for this task group.
     */
    private TaskGroup<ResultT, TaskT> proxyTaskGroup;

    /**
     * Task group termination strategy to be used once any task in the group error-ed.
     */
    private final TaskGroupTerminateOnErrorStrategy taskGroupTerminateOnErrorStrategy;
    /**
     * Flag indicating whether this group is marked as cancelled or not. This flag will be used only
     * when group's terminate on error strategy is set as
     * {@link TaskGroupTerminateOnErrorStrategy#TERMINATE_ON_INPROGRESS_TASKS_COMPLETION}.
     * Effect of setting this flag can be think as broadcasting a cancellation signal to tasks those
     * are yet to execute.
     */
    private boolean isGroupCancelled;
    /**
     * The shared exception object used to indicate that a task is not executed since the group
     * is marked as cancelled i.e. {@link this#isGroupCancelled} is set.
     */
    private final TaskCancelledException taskCancelledException = new TaskCancelledException();

    /**
     * Creates TaskGroup.
     *
     * @param rootTaskEntry the entry holding root task
     * @param taskGroupTerminateOnErrorStrategy termination strategy to be used on error
     */
    private TaskGroup(TaskGroupEntry<ResultT, TaskT> rootTaskEntry,
                      TaskGroupTerminateOnErrorStrategy taskGroupTerminateOnErrorStrategy) {
        super(rootTaskEntry);
        this.taskGroupTerminateOnErrorStrategy = taskGroupTerminateOnErrorStrategy;
    }

    /**
     * Creates TaskGroup.
     *
     * @param rootTaskItemId the id of the root task in the group
     * @param rootTaskItem the root task
     * @param taskGroupTerminateOnErrorStrategy group termination strategy to be used on error
     */
    public TaskGroup(String rootTaskItemId,
                     TaskT rootTaskItem,
                     TaskGroupTerminateOnErrorStrategy taskGroupTerminateOnErrorStrategy) {
        this(new TaskGroupEntry<ResultT, TaskT>(rootTaskItemId, rootTaskItem), taskGroupTerminateOnErrorStrategy);
    }

    /**
     * Gets the result produced by a task in the group.
     *
     * @param taskId the task item id
     * @return the task result, null will be returned if task has not yet been executed
     */
    public ResultT taskResult(String taskId) {
        TaskGroupEntry<ResultT, TaskT> taskGroupEntry = super.getNode(taskId);
        if (taskGroupEntry == null) {
            throw new IllegalArgumentException("A task with id '" + taskId + "' is not found");
        }
        return taskGroupEntry.taskResult();
    }

    /**
     * Mark root of this task task group depends on the given task group's root.
     * <p>
     * This means this task group's root can be executed only after the completion of all
     * tasks in the given group.
     *
     * @param dependencyTaskGroup the task group that this task group depends on
     */
    public void addDependencyTaskGroup(TaskGroup<ResultT, TaskT> dependencyTaskGroup) {
        DAGraph<TaskT, TaskGroupEntry<ResultT, TaskT>> dependencyGraph = dependencyTaskGroup;
        this.addDependencyGraph(dependencyGraph);
    }

    /**
     * Mark root of the given task group depends on this task group's root.
     * <p>
     * This means given task group's root can be executed only after the completion of all
     * tasks in this group.
     *
     * @param dependentTaskGroup the task group depends on this task group
     */
    public void addDependentTaskGroup(TaskGroup<ResultT, TaskT> dependentTaskGroup) {
        DAGraph<TaskT, TaskGroupEntry<ResultT, TaskT>> dependentGraph = dependentTaskGroup;
        this.addDependentGraph(dependentGraph);
    }

    /**
     * Executes tasks in the group.
     *
     * @return an observable that emits the result of tasks in the order they finishes.
     */
    public Observable<ResultT> executeAsync() {
        if (!isPreparer()) {
            return Observable.error(new IllegalStateException("executeAsync can be called"
                    + " only from root TaskGroup"));
        }
        this.isGroupCancelled = false;
        // Prepare tasks and queue the ready tasks (terminal tasks with no dependencies)
        //
        prepareTasks();
        // Runs the ready tasks concurrently
        //
        return executeReadyTasksAsync();
    }

    /**
     * Run the prepare stage of the tasks in the group, preparation allows tasks to define additional
     * task dependencies.
     */
    private void prepareTasks() {
        boolean isPreparePending;
        HashSet<String> preparedTasksKeys = new HashSet<>();
        // Invokes 'prepare' on a subset of non-prepared tasks in the group. Initially preparation
        // is pending on all task items.
        List<TaskGroupEntry<ResultT, TaskT>> entries = this.entriesSnapshot();
        do {
            isPreparePending = false;
            for (TaskGroupEntry<ResultT, TaskT> entry : entries) {
                if (!preparedTasksKeys.contains(entry.key())) {
                    entry.data().prepare();
                    preparedTasksKeys.add(entry.key());
                }
            }
            int prevSize = entries.size();
            entries = this.entriesSnapshot();
            if (entries.size() > prevSize) {
                // If new task dependencies/dependents added in 'prepare' then set the
                // flag which indicates another pass is required to 'prepare' new task
                // items
                isPreparePending = true;
            }
        } while (isPreparePending);  // Run another pass if new dependencies were added in this pass
        super.prepareForEnumeration();
    }

    /**
     * @return list with nodes in the graph.
     */
    private List<TaskGroupEntry<ResultT, TaskT>> entriesSnapshot() {
        List<TaskGroupEntry<ResultT, TaskT>> entries = new ArrayList<>();
        super.prepareForEnumeration();
        for (TaskGroupEntry<ResultT, TaskT> current = super.getNext(); current != null; current = super.getNext()) {
            entries.add(current);
            super.reportCompletion(current);
        }
        return entries;
    }

    /**
     * Executes the ready tasks.
     *
     * @return an observable that emits the result of tasks in the order they finishes.
     */
    private Observable<ResultT> executeReadyTasksAsync() {
        TaskGroupEntry<ResultT, TaskT> entry = super.getNext();
        final List<Observable<ResultT>> observables = new ArrayList<>();
        // Enumerate the ready tasks (those with dependencies resolved) and kickoff them concurrently
        //
        while (entry != null) {
            final TaskGroupEntry<ResultT, TaskT> currentEntry = entry;
            Observable<ResultT> currentTaskObservable = executeTaskAsync(currentEntry);
            Func1<ResultT, Observable<ResultT>> onNext = new Func1<ResultT, Observable<ResultT>>() {
                @Override
                public Observable<ResultT> call(ResultT taskResult) {
                    return Observable.just(taskResult);
                }
            };
            Func1<Throwable, Observable<ResultT>> onError = new Func1<Throwable, Observable<ResultT>>() {
                @Override
                public Observable<ResultT> call(Throwable throwable) {
                    // Append next observable on error terminate event of this observable
                    return processFaultedTaskAsync(currentEntry, throwable);
                }
            };
            Func0<Observable<ResultT>> onComplete = new Func0<Observable<ResultT>>() {
                @Override
                public Observable<ResultT> call() {
                    // Append next observable on successful terminate event of this observable
                    return processCompletedTaskAsync(currentEntry);
                }
            };
            observables.add(currentTaskObservable.flatMap(onNext, onError, onComplete));
            entry = super.getNext();
        }
        return Observable.mergeDelayError(observables);
    }

    /**
     * Executes the task stored in the given entry.
     * <p>
     * if the task cannot be executed because the group marked as cancelled then an observable
     * that emit {@link TaskCancelledException} will be returned.
     *
     * @param entry the entry holding task
     * @return an observable represents result of task in the given entry.
     */
    private Observable<ResultT> executeTaskAsync(final TaskGroupEntry<ResultT, TaskT> entry) {
        if (this.isGroupCancelled) {
            return toErrorObservable(taskCancelledException);
        }
        return entry.executeTaskAsync(isRootEntry(entry));
    }

    /**
     * Handles successful completion of a task.
     * <p>
     * If the task is not root (terminal) task then this kickoff execution of next set of ready tasks
     *
     * @param completedEntry the entry holding completed task
     * @return an observable represents asynchronous operation in the next stage
     */
    private Observable<ResultT> processCompletedTaskAsync(final TaskGroupEntry<ResultT, TaskT> completedEntry) {
        reportCompletion(completedEntry);
        if (isRootEntry(completedEntry)) {
            return Observable.empty();
        }
        return executeReadyTasksAsync();
    }

    /**
     * Handles a faulted task.
     *
     * @param faultedEntry the entry holding faulted task
     * @param throwable the reason for fault
     * @return an observable represents asynchronous operation in the next stage
     */
    private Observable<ResultT> processFaultedTaskAsync(final TaskGroupEntry<ResultT, TaskT> faultedEntry,
                                                        Throwable throwable) {
        this.isGroupCancelled = this.taskGroupTerminateOnErrorStrategy
                == TaskGroupTerminateOnErrorStrategy.TERMINATE_ON_INPROGRESS_TASKS_COMPLETION;
        reportError(faultedEntry, throwable);
        if (isRootEntry(faultedEntry)) {
            if (shouldPropagateException(throwable)) {
                return toErrorObservable(throwable);
            }
            return Observable.empty();
        }
        if (shouldPropagateException(throwable)) {
            return Observable.concatDelayError(executeReadyTasksAsync(), toErrorObservable(throwable));
        }
        return executeReadyTasksAsync();
    }

    /**
     * Check that given entry is the root entry in this group.
     *
     * @param taskGroupEntry the entry
     * @return true if the entry is root entry in the group, false otherwise.
     */
    private boolean isRootEntry(TaskGroupEntry<ResultT, TaskT> taskGroupEntry) {
        return isRootNode(taskGroupEntry);
    }

    /**
     * Checks the given throwable needs to be propagated to final stream returned by
     * {@link this#executeAsync()} method.
     *
     * @param throwable the exception to check
     * @return true if the throwable needs to be included in the {@link rx.exceptions.CompositeException}
     * emitted by the final stream.
     */
    private boolean shouldPropagateException(Throwable throwable) {
        return (!(throwable instanceof ErroredDependencyTaskException)
                && !(throwable instanceof TaskCancelledException));
    }

    /**
     * Gets the given throwable as observable.
     *
     * @param throwable the throwable to wrap
     * @return observable with throwable wrapped
     */
    private Observable<ResultT> toErrorObservable(Throwable throwable) {
        return Observable.error(throwable);
    }

    /**
     * An interface representing a type that is a part of TaskGroup.
     *
     * @param <T> type of the value returned by tasks in the group
     * @param <U> type of the task that can return a value
     */
    public interface HasTaskGroup<T, U extends TaskItem<T>> {
        /**
         * @return Gets the task group.
         */
        TaskGroup<T, U> taskGroup();
    }
}
