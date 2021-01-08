package com.azure.storage.queue.customization;

import com.azure.autorest.customization.ClassCustomization;
import com.azure.autorest.customization.Customization;
import com.azure.autorest.customization.LibraryCustomization;
import com.azure.autorest.customization.PackageCustomization;

/**
 * Customization class for Queue Storage.
 */
public class QueueStorageCustomization extends Customization {
    @Override
    public void customize(LibraryCustomization customization) {
        PackageCustomization models = customization.getPackage("com.azure.storage.queue.implementation.models");
        // Rename StorageErrorException to QueueStorageException
        ClassCustomization exception = models.getClass("StorageErrorException")
            .rename("QueueStorageException");
//        exception.getJavadoc().setDescription("A {@code StorageException} is thrown whenever Azure Storage successfully returns an error code that is not 200-level. "
//            + "Users can inspect the status code and error code to determine the cause of the error response. The exception message "
//            + "may also contain more detailed information depending on the type of error. The user may also inspect the raw HTTP "
//            + "response or call toString to get the full payload of the error response if present. "
//            + "Note that even some expected \"errors\" will be thrown as a {@code StorageException}. For example, some users may "
//            + "perform a getProperties request on an entity to determine whether it exists or not. If it does not exists, an "
//            + "exception will be thrown even though this may be considered an expected indication of absence in this case. "
//            + "<p><strong>Sample Code</strong></p>"
//            + "<p>For more samples, please see the <a href=\"https://github.com/Azure/azure-storage-java/blob/master/src/test/java/com/microsoft/azure/storage/Samples.java\">sample file</a></p>");



    }
}
