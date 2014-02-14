package com.linkedin.uif.configuration;

/**
 * A central place for all UIF configuration property keys.
 */
public class ConfigurationKeys {

    // Directory where all job configuration files are stored
    public static final String JOB_CONFIG_FILE_DIR_KEY = "jobconf.dir";

    /**
     * Common job configuraion properties
     */
    public static final String JOB_NAME_KEY = "job.name";
    public static final String JOB_GROUP_KEY = "job.group";
    public static final String JOB_DESCRIPTION_KEY = "job.description";
    public static final String JOB_SCHEDULE_KEY = "job.schedule";
    public static final String SOURCE_CLASS_KEY = "source.class";
    public static final String CONVERTER_CLASSES_KEY = "converter.classes";
    public static final String SOURCE_SCHEMA_TYPE_KEY = "source.schema.type";

    /**
     * Writer configuration properties
     */
    public static final String WRITER_DESTINATION_CONFIG_KEY_PREFIX = "writer";
    public static final String WRITER_DESTINATION_TYPE_KEY =
            WRITER_DESTINATION_CONFIG_KEY_PREFIX + ".destination.type";
    public static final String WRITER_OUTPUT_FORMAT_KEY = ".output.format";

    /**
     * HDFS writer configuration properties
     */
    public static final String FILE_SYSTEM_URI_KEY =
            WRITER_DESTINATION_CONFIG_KEY_PREFIX + ".fs.uri";
    public static final String STAGING_DIR_KEY =
            WRITER_DESTINATION_CONFIG_KEY_PREFIX + ".staging.dir";
    public static final String OUTPUT_DIR_KEY =
            WRITER_DESTINATION_CONFIG_KEY_PREFIX + ".output.dir";
    public static final String FILE_NAME_KEY =
            WRITER_DESTINATION_CONFIG_KEY_PREFIX + ".file.name";
    public static final String BUFFER_SIZE_KEY =
            WRITER_DESTINATION_CONFIG_KEY_PREFIX + ".buffer.size";
    public static final String DEFAULT_STAGING_DIR = "";
    public static final String DEFAULT_OUTPUT_DIR = "";
    public static final String DEFAULT_BUFFER_SIZE = "4096";
}