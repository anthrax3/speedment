module com.speedment.generator.standard {
    exports com.speedment.generator.standard;
    requires com.speedment.common.codegen;
    requires com.speedment.common.function;
    requires com.speedment.common.injector;
    requires com.speedment.common.invariant;
    requires com.speedment.common.json;
    requires com.speedment.common.mapstream;
    requires com.speedment.generator.translator;
    requires com.speedment.runtime.config;
    requires com.speedment.runtime.core;
    requires com.speedment.runtime.field;
    requires com.speedment.runtime.typemapper;
    requires java.sql;
}