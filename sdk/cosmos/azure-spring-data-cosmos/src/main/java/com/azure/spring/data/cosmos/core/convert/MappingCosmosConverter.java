// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.spring.data.cosmos.core.convert;

import com.azure.spring.data.cosmos.Constants;
import com.azure.spring.data.cosmos.core.mapping.CosmosPersistentEntity;
import com.azure.spring.data.cosmos.core.mapping.CosmosPersistentProperty;
import com.azure.spring.data.cosmos.exception.CosmosDBAccessException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.support.GenericConversionService;
import org.springframework.data.convert.EntityConverter;
import org.springframework.data.mapping.MappingException;
import org.springframework.data.mapping.PersistentPropertyAccessor;
import org.springframework.data.mapping.context.MappingContext;
import org.springframework.data.mapping.model.ConvertingPropertyAccessor;
import org.springframework.util.Assert;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import static com.azure.spring.data.cosmos.Constants.ISO_8601_COMPATIBLE_DATE_PATTERN;

/**
 * A converter class between common types and cosmosItemProperties
 */
public class MappingCosmosConverter
    implements EntityConverter<CosmosPersistentEntity<?>, CosmosPersistentProperty, Object,
    JsonNode>,
    ApplicationContextAware {

    protected final MappingContext<? extends CosmosPersistentEntity<?>,
        CosmosPersistentProperty> mappingContext;
    protected GenericConversionService conversionService;
    private ApplicationContext applicationContext;
    private final ObjectMapper objectMapper;

    /**
     * Initialization
     *
     * @param mappingContext must not be {@literal null}
     * @param objectMapper   must not be {@literal null}
     */
    public MappingCosmosConverter(
        MappingContext<? extends CosmosPersistentEntity<?>, CosmosPersistentProperty> mappingContext,
        @Qualifier(Constants.OBJECT_MAPPER_BEAN_NAME) ObjectMapper objectMapper) {
        this.mappingContext = mappingContext;
        this.conversionService = new GenericConversionService();
        this.objectMapper = objectMapper == null ? ObjectMapperFactory.getObjectMapper()
            : objectMapper;
    }

    @Override
    public <R> R read(Class<R> type, JsonNode jsonNode) {

        final CosmosPersistentEntity<?> entity = mappingContext.getPersistentEntity(type);
        Assert.notNull(entity, "Entity is null.");

        return readInternal(entity, type, jsonNode);
    }

    @Override
    public void write(Object source, JsonNode sink) {
        throw new UnsupportedOperationException("The feature is not implemented yet");
    }

    private <R> R readInternal(final CosmosPersistentEntity<?> entity, Class<R> type,
                               final JsonNode jsonNode) {
        final ObjectNode objectNode = jsonNode.deepCopy();
        try {
            final CosmosPersistentProperty idProperty = entity.getIdProperty();
            final JsonNode idValue = jsonNode.get("id");
            if (idProperty != null) {
                // Replace the key id to the actual id field name in domain
                objectNode.remove(Constants.ID_PROPERTY_NAME);
                objectNode.set(idProperty.getName(), idValue);
            }
            return objectMapper.treeToValue(objectNode, type);
        } catch (JsonProcessingException e) {
            throw new IllegalStateException("Failed to read the source document "
                + objectNode.toPrettyString()
                + "  to target type "
                + type, e);
        }
    }

    /**
     * To write source entity as a cosmos item
     *
     * @param sourceEntity must not be {@literal null}
     * @return CosmosItemProperties
     * @throws MappingException        no mapping metadata for entity type
     * @throws CosmosDBAccessException fail to map document value
     */
    public JsonNode writeJsonNode(Object sourceEntity) {
        if (sourceEntity == null) {
            return null;
        }

        final CosmosPersistentEntity<?> persistentEntity =
            mappingContext.getPersistentEntity(sourceEntity.getClass());

        if (persistentEntity == null) {
            throw new MappingException("no mapping metadata for entity type: "
                + sourceEntity.getClass().getName());
        }

        final ConvertingPropertyAccessor<?> accessor = getPropertyAccessor(sourceEntity);
        final CosmosPersistentProperty idProperty = persistentEntity.getIdProperty();
        final ObjectNode cosmosObjectNode;

        try {
            cosmosObjectNode =
                (ObjectNode)objectMapper.readTree(objectMapper.writeValueAsString(sourceEntity));
        } catch (JsonProcessingException e) {
            throw new CosmosDBAccessException("Failed to map document value.", e);
        }

        if (idProperty != null) {
            final Object value = accessor.getProperty(idProperty);
            final String id = value == null ? null : value.toString();
            cosmosObjectNode.put("id", id);
        }

        return cosmosObjectNode;
    }

    /**
     * To get application context
     *
     * @return ApplicationContext
     */
    public ApplicationContext getApplicationContext() {
        return this.applicationContext;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public ConversionService getConversionService() {
        return conversionService;
    }

    /**
     * To get mapping context
     *
     * @return MappingContext
     */
    public MappingContext<? extends CosmosPersistentEntity<?>, CosmosPersistentProperty> getMappingContext() {
        return mappingContext;
    }


    private ConvertingPropertyAccessor<?> getPropertyAccessor(Object entity) {
        final CosmosPersistentEntity<?> entityInformation =
            mappingContext.getPersistentEntity(entity.getClass());

        Assert.notNull(entityInformation, "EntityInformation should not be null.");
        final PersistentPropertyAccessor<?> accessor =
            entityInformation.getPropertyAccessor(entity);
        return new ConvertingPropertyAccessor<>(accessor, conversionService);
    }

    /**
     * Convert a property value to the value stored in CosmosDB
     *
     * @param fromPropertyValue source property value
     * @return fromPropertyValue converted property value stored in CosmosDB
     */
    public static Object toCosmosDbValue(Object fromPropertyValue) {
        if (fromPropertyValue == null) {
            return null;
        }

        // com.microsoft.azure.data.cosmos.JsonSerializable#set(String, T) cannot set values for
        // Date and Enum correctly

        if (fromPropertyValue instanceof Date) {
            fromPropertyValue = ((Date)fromPropertyValue).getTime();
        } else if (fromPropertyValue instanceof ZonedDateTime) {
            fromPropertyValue = ((ZonedDateTime)fromPropertyValue)
                .format(DateTimeFormatter.ofPattern(ISO_8601_COMPATIBLE_DATE_PATTERN));
        } else if (fromPropertyValue instanceof Enum) {
            fromPropertyValue = fromPropertyValue.toString();
        }

        return fromPropertyValue;
    }
}
