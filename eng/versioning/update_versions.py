# Copyright (c) Microsoft Corporation. All rights reserved.
# Licensed under the MIT License.

# Use case: Update all the versions in README.md and pom.xml files based on
# the versions in versions_[client|data|management].txt/dependencies_[client|data|management].txt
#
#    python eng/versioning/update_versions.py --update-type [library|dependency|all] -build-type [client|data|management]
#
# Use case: Update the versions in a particular file
#
#    python utilities/update_versions.py --update-type [library|dependency|all] -build-type [client|data|management] --target-file pom-file-to-update
#
# The script must be run at the root of azure-sdk-for-java.

import argparse
from datetime import timedelta
from enum import Enum
import os
import re
import time

version_update_marker = re.compile(r'\{x-version-update;([^;]+);([^}]+)\}')
# regex for the version string is suggested one directly from semver.org
# it's worth noting that both regular expressions on that page have start
# of line (^) and end of line ($) anchors which need to be removed since
# what's being matched is in the middle of the string
# https://semver.org/#is-there-a-suggested-regular-expression-regex-to-check-a-semver-string
version_regex_str = r'(0|[1-9]\d*)\.(0|[1-9]\d*)\.(0|[1-9]\d*)(?:-((?:0|[1-9]\d*|\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\.(?:0|[1-9]\d*|\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\+([0-9a-zA-Z-]+(?:\.[0-9a-zA-Z-]+)*))?'

class UpdateType(Enum):
    dependency = 'dependency'
    library = 'library'
    all = 'all'

    # defining string is necessary to get ArgumentParser's help output to produce
    # human readable values of UpdateType
    def __str__(self):
        return self.value

class BuildType(Enum):
    client = 'client'
    data = 'data'
    management = 'management'
    
    # defining string is necessary to get ArgumentParser's help output to produce
    # human readable values of BuildType
    def __str__(self):
        return self.value

class CodeModule:
    def __init__(self, module_str):
        # For library versions there will be up to 3 items resulting from the split
        # which will be module name, dependency version and current version. For
        # dependency versions there should only be 2 items resulting from the split
        # which will be module name and dependency version. 
        items = module_str.split(';')
        if len(items) == 2: 
            self.name = items[0]
            self.dependency = items[1].strip()
        elif len(items) == 3:
            self.name = items[0]
            self.dependency = items[1]
            self.current = items[2].strip()
        else: 
            raise ValueError('unable to parse module string: ' + module_str)

    def __str__(self):
        # current may or may not exist
        try:
            return self.name + ': Dependency version=' + self.dependency + ': Current version=' + self.current
        except AttributeError:
            return self.name + ': Dependency version=' + self.dependency

def update_versions(version_map, target_file):

    newlines = []
    repl_open, repl_thisline, file_changed = False, False, False
    with open(target_file) as f:
        for line in f:
            repl_thisline = repl_open
            match = version_update_marker.search(line)
            if match:
                module_name, version_type = match.group(1), match.group(2)
                repl_thisline = True
            if repl_thisline:
                # If the module isn't found then just continue. This can
                # happen if we're going through and replacing only library
                # or only dependency versions
                # JRS maybe have a diagnostics mode and print something out?
                if module_name not in version_map:
                    newlines.append(line)
                    continue
                module = version_map[module_name]
                new_version = ''
                if version_type == 'current':
                    try:
                        new_version = module.current
                    except AttributeError:
                        raise ValueError('Module: {0} does not have a current version.\nFile={1}\nLine={2}'.format(module_name, target_file, line))
                elif version_type == 'dependency':
                    new_version = module.dependency
                else:
                    raise ValueError('Invalid version type: {} for module: {}.\nFile={}\nLine={}'.format(version_type, module_name, target_file, line))

                newline = re.sub(version_regex_str, new_version, line)
                newlines.append(newline)
                file_changed = True
            else:
                newlines.append(line)

            if not repl_open:
                module_name, version_type = '', ''

    if file_changed:
        with open(target_file, 'w') as f:
            print('updating: ' + target_file)
            for line in newlines:
                f.write(line)

def load_version_map_from_file(the_file, version_map):
    with open(the_file) as f:
        for raw_line in f:
            stripped_line = raw_line.strip()
            if not stripped_line or stripped_line.startswith('#'):
                continue
            module = CodeModule(stripped_line)
            version_map[module.name] = module

def display_version_info(version_map):
    for value in version_map.values():
        print(value)
    
def update_versions_all(update_type, build_type, target_file):
    version_map = {}
    # Load the version and/or dependency file for the given UpdateType into
    # the verion_map. If UpdateType.all is selected then versions for both
    # the libraries and dependencies are being updated.
    if update_type == UpdateType.library or update_type == UpdateType.all:
        version_file = os.path.normpath('eng/versioning/version_' + build_type.name + '.txt')
        print('version_file=' + version_file)
        load_version_map_from_file(version_file, version_map)

    if update_type == UpdateType.dependency or update_type == UpdateType.all:
        dependency_file = os.path.normpath('eng/versioning/dependency_' + build_type.name + '.txt')
        print('dependency_file=' + dependency_file)
        load_version_map_from_file(dependency_file, version_map)

    display_version_info(version_map)

    if target_file:
        update_versions(version_map, target_file)
    else:
        for root, _, files in os.walk("."):
            for file_name in files:
                file_path = root + os.sep + file_name
                # if file_name == 'README.md' or (file_name.startswith('pom.') and file_name.endswith('.xml')):
                if (file_name.startswith('pom.') and file_name.endswith('.xml')):
                    update_versions(version_map, file_path)

def main():
    parser = argparse.ArgumentParser(description='Replace version numbers in poms and READMEs.')
    parser.add_argument('--update-type', '--ut', type=UpdateType, choices=list(UpdateType))
    parser.add_argument('--build-type', '--bt', type=BuildType, choices=list(BuildType))
    parser.add_argument('--target-file', '--tf', nargs='?', help='File to update (optional) - all files in the current directory and subdirectories are scanned if omitted')
    args = parser.parse_args()
    if (args.build_type == BuildType.management):
        raise ValueError('{} is not currently supported.'.format(BuildType.management.name))
    start_time = time.time()
    update_versions_all(args.update_type, args.build_type, args.target_file)
    elapsed_time = time.time() - start_time
    print('elapsed_time={}'.format(elapsed_time))
    print('Total time for replacement: {}'.format(str(timedelta(seconds=elapsed_time))))

if __name__ == '__main__':
    main()