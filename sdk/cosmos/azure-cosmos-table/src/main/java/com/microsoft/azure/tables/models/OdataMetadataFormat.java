package com.microsoft.azure.tables.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for OdataMetadataFormat. */
public final class OdataMetadataFormat extends ExpandableStringEnum<OdataMetadataFormat> {
    /** Static value application/json;odata=nometadata for OdataMetadataFormat. */
    public static final OdataMetadataFormat APPLICATION_JSON_ODATA_NOMETADATA =
            fromString("application/json;odata=nometadata");

    /** Static value application/json;odata=minimalmetadata for OdataMetadataFormat. */
    public static final OdataMetadataFormat APPLICATION_JSON_ODATA_MINIMALMETADATA =
            fromString("application/json;odata=minimalmetadata");

    /** Static value application/json;odata=fullmetadata for OdataMetadataFormat. */
    public static final OdataMetadataFormat APPLICATION_JSON_ODATA_FULLMETADATA =
            fromString("application/json;odata=fullmetadata");

    /**
     * Creates or finds a OdataMetadataFormat from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OdataMetadataFormat.
     */
    @JsonCreator
    public static OdataMetadataFormat fromString(String name) {
        return fromString(name, OdataMetadataFormat.class);
    }

    /** @return known OdataMetadataFormat values. */
    public static Collection<OdataMetadataFormat> values() {
        return values(OdataMetadataFormat.class);
    }
}
