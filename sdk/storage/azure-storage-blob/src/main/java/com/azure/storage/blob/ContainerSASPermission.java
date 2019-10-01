// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob;


import com.azure.storage.common.SR;

import java.util.Locale;

/**
 * This is a helper class to construct a string representing the permissions granted by a ServiceSAS to a container.
 * Setting a value to true means that any SAS which uses these permissions will grant permissions for that operation.
 * It is possible to construct the permissions string without this class, but the order of the permissions is
 * particular and this class guarantees correctness.
 */
public final class ContainerSASPermission {
    private boolean readPermission;

    private boolean addPermission;

    private boolean createPermission;

    private boolean writePermission;

    private boolean deletePermission;

    private boolean listPermission;

    /**
     * Initializes an {@code ContainerSASPermission} object with all fields set to false.
     */
    public ContainerSASPermission() {
    }

    /**
     * Creates an {@code ContainerSASPermission} from the specified permissions string. This method will throw an
     * {@code IllegalArgumentException} if it encounters a character that does not correspond to a valid permission.
     *
     * @param permString A {@code String} which represents the {@code ContainerSASPermission}.
     * @return A {@code ContainerSASPermission} generated from the given {@code String}.
     * @throws IllegalArgumentException If {@code permString} contains a character other than r, a, c, w, d, or l.
     */
    public static ContainerSASPermission parse(String permString) {
        ContainerSASPermission permissions = new ContainerSASPermission();

        for (int i = 0; i < permString.length(); i++) {
            char c = permString.charAt(i);
            switch (c) {
                case 'r':
                    permissions.readPermission = true;
                    break;
                case 'a':
                    permissions.addPermission = true;
                    break;
                case 'c':
                    permissions.createPermission = true;
                    break;
                case 'w':
                    permissions.writePermission = true;
                    break;
                case 'd':
                    permissions.deletePermission = true;
                    break;
                case 'l':
                    permissions.listPermission = true;
                    break;
                default:
                    throw new IllegalArgumentException(
                        String.format(Locale.ROOT, SR.ENUM_COULD_NOT_BE_PARSED_INVALID_VALUE,
                            "Permissions", permString, c));
            }
        }
        return permissions;
    }

    /**
     * @return the read permission status
     */
    public boolean getReadPermission() {
        return readPermission;
    }

    /**
     * Sets the read permission status.
     *
     * @param readPermission Permission status to set
     * @return the updated ContainerSASPermission object
     */
    public ContainerSASPermission setReadPermission(boolean readPermission) {
        this.readPermission = readPermission;
        return this;
    }

    /**
     * @return the add permission status
     */
    public boolean getAddPermission() {
        return addPermission;
    }

    /**
     * Sets the add permission status.
     *
     * @param addPermission Permission status to set
     * @return the updated ContainerSASPermission object
     */
    public ContainerSASPermission setAddPermission(boolean addPermission) {
        this.addPermission = addPermission;
        return this;
    }

    /**
     * @return the create permission status
     */
    public boolean getCreatePermission() {
        return createPermission;
    }

    /**
     * Sets the create permission status.
     *
     * @param createPermission Permission status to set
     * @return the updated ContainerSASPermission object
     */
    public ContainerSASPermission setCreatePermission(boolean createPermission) {
        this.createPermission = createPermission;
        return this;
    }

    /**
     * @return the write permission status
     */
    public boolean getWritePermission() {
        return writePermission;
    }

    /**
     * Sets the write permission status.
     *
     * @param writePermission Permission status to set
     * @return the updated ContainerSASPermission object
     */
    public ContainerSASPermission setWritePermission(boolean writePermission) {
        this.writePermission = writePermission;
        return this;
    }

    /**
     * @return the delete permission status
     */
    public boolean getDeletePermission() {
        return deletePermission;
    }

    /**
     * Sets the delete permission status.
     *
     * @param deletePermission Permission status to set
     * @return the updated ContainerSASPermission object
     */
    public ContainerSASPermission setDeletePermission(boolean deletePermission) {
        this.deletePermission = deletePermission;
        return this;
    }

    /**
     * @return the list permission status
     */
    public boolean getListPermission() {
        return listPermission;
    }

    /**
     * Sets the list permission status.
     *
     * @param listPermission Permission status to set
     * @return the updated ContainerSASPermission object
     */
    public ContainerSASPermission setListPermission(boolean listPermission) {
        this.listPermission = listPermission;
        return this;
    }

    /**
     * Converts the given permissions to a {@code String}. Using this method will guarantee the permissions are in an
     * order accepted by the service.
     *
     * @return A {@code String} which represents the {@code ContainerSASPermission}.
     */
    @Override
    public String toString() {
        // The order of the characters should be as specified here to ensure correctness:
        // https://docs.microsoft.com/en-us/rest/api/storageservices/constructing-a-service-sas
        final StringBuilder builder = new StringBuilder();

        if (this.readPermission) {
            builder.append('r');
        }

        if (this.addPermission) {
            builder.append('a');
        }

        if (this.createPermission) {
            builder.append('c');
        }

        if (this.writePermission) {
            builder.append('w');
        }

        if (this.deletePermission) {
            builder.append('d');
        }

        if (this.listPermission) {
            builder.append('l');
        }

        return builder.toString();
    }
}
