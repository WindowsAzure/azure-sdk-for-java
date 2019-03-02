/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.appservice.v2016_03_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.appservice.v2016_03_01.Diagnostics;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.appservice.v2016_03_01.DiagnosticCategory;
import com.microsoft.azure.management.appservice.v2016_03_01.DetectorResponse;
import com.microsoft.azure.management.appservice.v2016_03_01.DetectorDefinition;
import com.microsoft.azure.management.appservice.v2016_03_01.DiagnosticDetectorResponse;
import com.microsoft.azure.management.appservice.v2016_03_01.DiagnosticAnalysis;
import com.microsoft.azure.management.appservice.v2016_03_01.AnalysisDefinition;

class DiagnosticsImpl extends WrapperImpl<DiagnosticsInner> implements Diagnostics {
    private final WebManager manager;

    DiagnosticsImpl(WebManager manager) {
        super(manager.inner().diagnostics());
        this.manager = manager;
    }

    public WebManager manager() {
        return this.manager;
    }

    private DiagnosticCategoryImpl wrapModel(DiagnosticCategoryInner inner) {
        return  new DiagnosticCategoryImpl(inner, manager());
    }

    @Override
    public Observable<DiagnosticCategory> listSiteDiagnosticCategoriesSlotAsync(final String resourceGroupName, final String siteName, final String slot) {
        DiagnosticsInner client = this.inner();
        return client.listSiteDiagnosticCategoriesSlotAsync(resourceGroupName, siteName, slot)
        .flatMapIterable(new Func1<Page<DiagnosticCategoryInner>, Iterable<DiagnosticCategoryInner>>() {
            @Override
            public Iterable<DiagnosticCategoryInner> call(Page<DiagnosticCategoryInner> page) {
                return page.items();
            }
        })
        .map(new Func1<DiagnosticCategoryInner, DiagnosticCategory>() {
            @Override
            public DiagnosticCategory call(DiagnosticCategoryInner inner) {
                return new DiagnosticCategoryImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DiagnosticCategory> getSiteDiagnosticCategorySlotAsync(String resourceGroupName, String siteName, String diagnosticCategory, String slot) {
        DiagnosticsInner client = this.inner();
        return client.getSiteDiagnosticCategorySlotAsync(resourceGroupName, siteName, diagnosticCategory, slot)
        .map(new Func1<DiagnosticCategoryInner, DiagnosticCategory>() {
            @Override
            public DiagnosticCategory call(DiagnosticCategoryInner inner) {
                return new DiagnosticCategoryImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DiagnosticCategory> listSiteDiagnosticCategoriesAsync(final String resourceGroupName, final String siteName) {
        DiagnosticsInner client = this.inner();
        return client.listSiteDiagnosticCategoriesAsync(resourceGroupName, siteName)
        .flatMapIterable(new Func1<Page<DiagnosticCategoryInner>, Iterable<DiagnosticCategoryInner>>() {
            @Override
            public Iterable<DiagnosticCategoryInner> call(Page<DiagnosticCategoryInner> page) {
                return page.items();
            }
        })
        .map(new Func1<DiagnosticCategoryInner, DiagnosticCategory>() {
            @Override
            public DiagnosticCategory call(DiagnosticCategoryInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<DiagnosticCategory> getSiteDiagnosticCategoryAsync(String resourceGroupName, String siteName, String diagnosticCategory) {
        DiagnosticsInner client = this.inner();
        return client.getSiteDiagnosticCategoryAsync(resourceGroupName, siteName, diagnosticCategory)
        .map(new Func1<DiagnosticCategoryInner, DiagnosticCategory>() {
            @Override
            public DiagnosticCategory call(DiagnosticCategoryInner inner) {
                return wrapModel(inner);
            }
       });
    }

    private DetectorResponseImpl wrapDetectorResponseModel(DetectorResponseInner inner) {
        return  new DetectorResponseImpl(inner, manager());
    }

    private DiagnosticAnalysisImpl wrapDiagnosticAnalysisModel(DiagnosticAnalysisInner inner) {
        return  new DiagnosticAnalysisImpl(inner, manager());
    }

    private Observable<DetectorResponseInner> getDetectorResponseInnerUsingDiagnosticsInnerAsync(String id) {
        String resourceGroupName = IdParsingUtils.getValueFromIdByName(id, "resourceGroups");
        String name = IdParsingUtils.getValueFromIdByName(id, "hostingEnvironments");
        String detectorName = IdParsingUtils.getValueFromIdByName(id, "detectors");
        DiagnosticsInner client = this.inner();
        return client.getHostingEnvironmentDetectorResponseAsync(resourceGroupName, name, detectorName);
    }

    private Observable<DiagnosticAnalysisInner> getDiagnosticAnalysisInnerUsingDiagnosticsInnerAsync(String id) {
        String resourceGroupName = IdParsingUtils.getValueFromIdByName(id, "resourceGroups");
        String siteName = IdParsingUtils.getValueFromIdByName(id, "sites");
        String diagnosticCategory = IdParsingUtils.getValueFromIdByName(id, "diagnostics");
        String analysisName = IdParsingUtils.getValueFromIdByName(id, "analyses");
        DiagnosticsInner client = this.inner();
        return client.getSiteAnalysisAsync(resourceGroupName, siteName, diagnosticCategory, analysisName);
    }

    @Override
    public Observable<DetectorResponse> getHostingEnvironmentDetectorResponseAsync(String resourceGroupName, String name, String detectorName) {
        DiagnosticsInner client = this.inner();
        return client.getHostingEnvironmentDetectorResponseAsync(resourceGroupName, name, detectorName)
        .map(new Func1<DetectorResponseInner, DetectorResponse>() {
            @Override
            public DetectorResponse call(DetectorResponseInner inner) {
                return wrapDetectorResponseModel(inner);
            }
       });
    }

    @Override
    public Observable<DetectorResponse> listHostingEnvironmentDetectorResponsesAsync(final String resourceGroupName, final String name) {
        DiagnosticsInner client = this.inner();
        return client.listHostingEnvironmentDetectorResponsesAsync(resourceGroupName, name)
        .flatMapIterable(new Func1<Page<DetectorResponseInner>, Iterable<DetectorResponseInner>>() {
            @Override
            public Iterable<DetectorResponseInner> call(Page<DetectorResponseInner> page) {
                return page.items();
            }
        })
        .map(new Func1<DetectorResponseInner, DetectorResponse>() {
            @Override
            public DetectorResponse call(DetectorResponseInner inner) {
                return wrapDetectorResponseModel(inner);
            }
        });
    }

    @Override
    public Observable<DetectorResponse> listSiteDetectorResponsesAsync(final String resourceGroupName, final String siteName) {
        DiagnosticsInner client = this.inner();
        return client.listSiteDetectorResponsesAsync(resourceGroupName, siteName)
        .flatMapIterable(new Func1<Page<DetectorResponseInner>, Iterable<DetectorResponseInner>>() {
            @Override
            public Iterable<DetectorResponseInner> call(Page<DetectorResponseInner> page) {
                return page.items();
            }
        })
        .map(new Func1<DetectorResponseInner, DetectorResponse>() {
            @Override
            public DetectorResponse call(DetectorResponseInner inner) {
                return new DetectorResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DetectorResponse> getSiteDetectorResponseAsync(String resourceGroupName, String siteName, String detectorName) {
        DiagnosticsInner client = this.inner();
        return client.getSiteDetectorResponseAsync(resourceGroupName, siteName, detectorName)
        .map(new Func1<DetectorResponseInner, DetectorResponse>() {
            @Override
            public DetectorResponse call(DetectorResponseInner inner) {
                return new DetectorResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DetectorDefinition> listSiteDetectorsAsync(final String resourceGroupName, final String siteName, final String diagnosticCategory) {
        DiagnosticsInner client = this.inner();
        return client.listSiteDetectorsAsync(resourceGroupName, siteName, diagnosticCategory)
        .flatMapIterable(new Func1<Page<DetectorDefinitionInner>, Iterable<DetectorDefinitionInner>>() {
            @Override
            public Iterable<DetectorDefinitionInner> call(Page<DetectorDefinitionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<DetectorDefinitionInner, DetectorDefinition>() {
            @Override
            public DetectorDefinition call(DetectorDefinitionInner inner) {
                return new DetectorDefinitionImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DetectorDefinition> getSiteDetectorAsync(final String resourceGroupName, final String siteName, final String diagnosticCategory, final String detectorName) {
        DiagnosticsInner client = this.inner();
        return client.getSiteDetectorAsync(resourceGroupName, siteName, diagnosticCategory, detectorName)
        .flatMapIterable(new Func1<Page<DetectorDefinitionInner>, Iterable<DetectorDefinitionInner>>() {
            @Override
            public Iterable<DetectorDefinitionInner> call(Page<DetectorDefinitionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<DetectorDefinitionInner, DetectorDefinition>() {
            @Override
            public DetectorDefinition call(DetectorDefinitionInner inner) {
                return new DetectorDefinitionImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DiagnosticDetectorResponse> executeSiteDetectorAsync(String resourceGroupName, String siteName, String detectorName, String diagnosticCategory) {
        DiagnosticsInner client = this.inner();
        return client.executeSiteDetectorAsync(resourceGroupName, siteName, detectorName, diagnosticCategory)
        .map(new Func1<DiagnosticDetectorResponseInner, DiagnosticDetectorResponse>() {
            @Override
            public DiagnosticDetectorResponse call(DiagnosticDetectorResponseInner inner) {
                return new DiagnosticDetectorResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DetectorResponse> listSiteDetectorResponsesSlotAsync(final String resourceGroupName, final String siteName, final String slot) {
        DiagnosticsInner client = this.inner();
        return client.listSiteDetectorResponsesSlotAsync(resourceGroupName, siteName, slot)
        .flatMapIterable(new Func1<Page<DetectorResponseInner>, Iterable<DetectorResponseInner>>() {
            @Override
            public Iterable<DetectorResponseInner> call(Page<DetectorResponseInner> page) {
                return page.items();
            }
        })
        .map(new Func1<DetectorResponseInner, DetectorResponse>() {
            @Override
            public DetectorResponse call(DetectorResponseInner inner) {
                return new DetectorResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DetectorResponse> getSiteDetectorResponseSlotAsync(String resourceGroupName, String siteName, String detectorName, String slot) {
        DiagnosticsInner client = this.inner();
        return client.getSiteDetectorResponseSlotAsync(resourceGroupName, siteName, detectorName, slot)
        .map(new Func1<DetectorResponseInner, DetectorResponse>() {
            @Override
            public DetectorResponse call(DetectorResponseInner inner) {
                return new DetectorResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DetectorDefinition> listSiteDetectorsSlotAsync(final String resourceGroupName, final String siteName, final String diagnosticCategory, final String slot) {
        DiagnosticsInner client = this.inner();
        return client.listSiteDetectorsSlotAsync(resourceGroupName, siteName, diagnosticCategory, slot)
        .flatMapIterable(new Func1<Page<DetectorDefinitionInner>, Iterable<DetectorDefinitionInner>>() {
            @Override
            public Iterable<DetectorDefinitionInner> call(Page<DetectorDefinitionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<DetectorDefinitionInner, DetectorDefinition>() {
            @Override
            public DetectorDefinition call(DetectorDefinitionInner inner) {
                return new DetectorDefinitionImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DetectorDefinition> getSiteDetectorSlotAsync(final String resourceGroupName, final String siteName, final String diagnosticCategory, final String detectorName, final String slot) {
        DiagnosticsInner client = this.inner();
        return client.getSiteDetectorSlotAsync(resourceGroupName, siteName, diagnosticCategory, detectorName, slot)
        .flatMapIterable(new Func1<Page<DetectorDefinitionInner>, Iterable<DetectorDefinitionInner>>() {
            @Override
            public Iterable<DetectorDefinitionInner> call(Page<DetectorDefinitionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<DetectorDefinitionInner, DetectorDefinition>() {
            @Override
            public DetectorDefinition call(DetectorDefinitionInner inner) {
                return new DetectorDefinitionImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DiagnosticDetectorResponse> executeSiteDetectorSlotAsync(String resourceGroupName, String siteName, String detectorName, String diagnosticCategory, String slot) {
        DiagnosticsInner client = this.inner();
        return client.executeSiteDetectorSlotAsync(resourceGroupName, siteName, detectorName, diagnosticCategory, slot)
        .map(new Func1<DiagnosticDetectorResponseInner, DiagnosticDetectorResponse>() {
            @Override
            public DiagnosticDetectorResponse call(DiagnosticDetectorResponseInner inner) {
                return new DiagnosticDetectorResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DiagnosticAnalysis> getSiteAnalysisAsync(String resourceGroupName, String siteName, String diagnosticCategory, String analysisName) {
        DiagnosticsInner client = this.inner();
        return client.getSiteAnalysisAsync(resourceGroupName, siteName, diagnosticCategory, analysisName)
        .map(new Func1<DiagnosticAnalysisInner, DiagnosticAnalysis>() {
            @Override
            public DiagnosticAnalysis call(DiagnosticAnalysisInner inner) {
                return wrapDiagnosticAnalysisModel(inner);
            }
       });
    }

    @Override
    public Observable<DiagnosticAnalysis> listSiteAnalysesAsync(final String resourceGroupName, final String siteName, final String diagnosticCategory) {
        DiagnosticsInner client = this.inner();
        return client.listSiteAnalysesAsync(resourceGroupName, siteName, diagnosticCategory)
        .flatMapIterable(new Func1<Page<AnalysisDefinitionInner>, Iterable<AnalysisDefinitionInner>>() {
            @Override
            public Iterable<AnalysisDefinitionInner> call(Page<AnalysisDefinitionInner> page) {
                return page.items();
            }
        })
        .flatMap(new Func1<AnalysisDefinitionInner, Observable<DiagnosticAnalysisInner>>() {
            @Override
            public Observable<DiagnosticAnalysisInner> call(AnalysisDefinitionInner inner) {
                return getDiagnosticAnalysisInnerUsingDiagnosticsInnerAsync(inner.id());
            }
        })
        .map(new Func1<DiagnosticAnalysisInner, DiagnosticAnalysis>() {
            @Override
            public DiagnosticAnalysis call(DiagnosticAnalysisInner inner) {
                return wrapDiagnosticAnalysisModel(inner);
            }
        });
    }

    @Override
    public Observable<DiagnosticAnalysis> executeSiteAnalysisAsync(String resourceGroupName, String siteName, String diagnosticCategory, String analysisName) {
        DiagnosticsInner client = this.inner();
        return client.executeSiteAnalysisAsync(resourceGroupName, siteName, diagnosticCategory, analysisName)
        .map(new Func1<DiagnosticAnalysisInner, DiagnosticAnalysis>() {
            @Override
            public DiagnosticAnalysis call(DiagnosticAnalysisInner inner) {
                return new DiagnosticAnalysisImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<AnalysisDefinition> listSiteAnalysesSlotAsync(final String resourceGroupName, final String siteName, final String diagnosticCategory, final String slot) {
        DiagnosticsInner client = this.inner();
        return client.listSiteAnalysesSlotAsync(resourceGroupName, siteName, diagnosticCategory, slot)
        .flatMapIterable(new Func1<Page<AnalysisDefinitionInner>, Iterable<AnalysisDefinitionInner>>() {
            @Override
            public Iterable<AnalysisDefinitionInner> call(Page<AnalysisDefinitionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<AnalysisDefinitionInner, AnalysisDefinition>() {
            @Override
            public AnalysisDefinition call(AnalysisDefinitionInner inner) {
                return new AnalysisDefinitionImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DiagnosticAnalysis> getSiteAnalysisSlotAsync(String resourceGroupName, String siteName, String diagnosticCategory, String analysisName, String slot) {
        DiagnosticsInner client = this.inner();
        return client.getSiteAnalysisSlotAsync(resourceGroupName, siteName, diagnosticCategory, analysisName, slot)
        .map(new Func1<DiagnosticAnalysisInner, DiagnosticAnalysis>() {
            @Override
            public DiagnosticAnalysis call(DiagnosticAnalysisInner inner) {
                return new DiagnosticAnalysisImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DiagnosticAnalysis> executeSiteAnalysisSlotAsync(String resourceGroupName, String siteName, String diagnosticCategory, String analysisName, String slot) {
        DiagnosticsInner client = this.inner();
        return client.executeSiteAnalysisSlotAsync(resourceGroupName, siteName, diagnosticCategory, analysisName, slot)
        .map(new Func1<DiagnosticAnalysisInner, DiagnosticAnalysis>() {
            @Override
            public DiagnosticAnalysis call(DiagnosticAnalysisInner inner) {
                return new DiagnosticAnalysisImpl(inner, manager());
            }
        });
    }

}
