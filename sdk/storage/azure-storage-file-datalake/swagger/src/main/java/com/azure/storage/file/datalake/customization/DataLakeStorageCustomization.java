// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.file.datalake.customization;

import com.azure.autorest.customization.ClassCustomization;
import com.azure.autorest.customization.Customization;
import com.azure.autorest.customization.LibraryCustomization;
import com.azure.autorest.customization.MethodCustomization;
import com.azure.autorest.customization.PackageCustomization;

/**
 * Customization class for File DataLake Storage.
 */
public class DataLakeStorageCustomization extends Customization {
    @Override
    public void customize(LibraryCustomization customization) {
        PackageCustomization implementation = customization.getPackage("com.azure.storage.file.datalake.implementation");

        ClassCustomization fileSystemsImpl = implementation.getClass("FileSystemsImpl");
        modifyUnexpectedResponseExceptionType(fileSystemsImpl.getMethod("create"));
        modifyUnexpectedResponseExceptionType(fileSystemsImpl.getMethod("setProperties"));
        modifyUnexpectedResponseExceptionType(fileSystemsImpl.getMethod("getProperties"));
        modifyUnexpectedResponseExceptionType(fileSystemsImpl.getMethod("delete"));
        modifyUnexpectedResponseExceptionType(fileSystemsImpl.getMethod("listPaths"));

        ClassCustomization pathsImpl = implementation.getClass("PathsImpl");
        modifyUnexpectedResponseExceptionType(pathsImpl.getMethod("create"));
        modifyUnexpectedResponseExceptionType(pathsImpl.getMethod("update"));
        modifyUnexpectedResponseExceptionType(pathsImpl.getMethod("lease"));
        modifyUnexpectedResponseExceptionType(pathsImpl.getMethod("read"));
        modifyUnexpectedResponseExceptionType(pathsImpl.getMethod("getProperties"));
        modifyUnexpectedResponseExceptionType(pathsImpl.getMethod("delete"));
        modifyUnexpectedResponseExceptionType(pathsImpl.getMethod("setAccessControl"));
        modifyUnexpectedResponseExceptionType(pathsImpl.getMethod("setAccessControlRecursive"));
        modifyUnexpectedResponseExceptionType(pathsImpl.getMethod("flushData"));
        modifyUnexpectedResponseExceptionType(pathsImpl.getMethod("appendData"));
        modifyUnexpectedResponseExceptionType(pathsImpl.getMethod("setExpiry"));

        ClassCustomization servicesImpl = implementation.getClass("ServicesImpl");
        modifyUnexpectedResponseExceptionType(servicesImpl.getMethod("listFileSystems"));
    }

    private void modifyUnexpectedResponseExceptionType(MethodCustomization method) {
        method.removeAnnotation("@UnexpectedResponseExceptionType(StorageErrorException.class)");
        method.addAnnotation("@UnexpectedResponseExceptionType(com.azure.storage.file.datalake.models.DataLakeStorageException.class)");
    }
}
