// Converter.java

// To use this code, add the following Maven dependency to your project:
//
//
//     com.fasterxml.jackson.core     : jackson-databind          : 2.9.0
//     com.fasterxml.jackson.datatype : jackson-datatype-jsr310   : 2.9.0
//
// Import this package:
//
//     import com.apiverve.data.Converter;
//
// Then you can deserialize a JSON string with
//
//     TruthTableGeneratorData data = Converter.fromJsonString(jsonString);

package com.apiverve.truthtable.data;

import java.io.IOException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.*;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

public class Converter {
    // Date-time helpers

    private static final DateTimeFormatter DATE_TIME_FORMATTER = new DateTimeFormatterBuilder()
            .appendOptional(DateTimeFormatter.ISO_DATE_TIME)
            .appendOptional(DateTimeFormatter.ISO_OFFSET_DATE_TIME)
            .appendOptional(DateTimeFormatter.ISO_INSTANT)
            .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SX"))
            .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ssX"))
            .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
            .toFormatter()
            .withZone(ZoneOffset.UTC);

    public static OffsetDateTime parseDateTimeString(String str) {
        return ZonedDateTime.from(Converter.DATE_TIME_FORMATTER.parse(str)).toOffsetDateTime();
    }

    private static final DateTimeFormatter TIME_FORMATTER = new DateTimeFormatterBuilder()
            .appendOptional(DateTimeFormatter.ISO_TIME)
            .appendOptional(DateTimeFormatter.ISO_OFFSET_TIME)
            .parseDefaulting(ChronoField.YEAR, 2020)
            .parseDefaulting(ChronoField.MONTH_OF_YEAR, 1)
            .parseDefaulting(ChronoField.DAY_OF_MONTH, 1)
            .toFormatter()
            .withZone(ZoneOffset.UTC);

    public static OffsetTime parseTimeString(String str) {
        return ZonedDateTime.from(Converter.TIME_FORMATTER.parse(str)).toOffsetDateTime().toOffsetTime();
    }
    // Serialize/deserialize helpers

    public static TruthTableGeneratorData fromJsonString(String json) throws IOException {
        return getObjectReader().readValue(json);
    }

    public static String toJsonString(TruthTableGeneratorData obj) throws JsonProcessingException {
        return getObjectWriter().writeValueAsString(obj);
    }

    private static ObjectReader reader;
    private static ObjectWriter writer;

    private static void instantiateMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        SimpleModule module = new SimpleModule();
        module.addDeserializer(OffsetDateTime.class, new JsonDeserializer<OffsetDateTime>() {
            @Override
            public OffsetDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
                String value = jsonParser.getText();
                return Converter.parseDateTimeString(value);
            }
        });
        mapper.registerModule(module);
        reader = mapper.readerFor(TruthTableGeneratorData.class);
        writer = mapper.writerFor(TruthTableGeneratorData.class);
    }

    private static ObjectReader getObjectReader() {
        if (reader == null) instantiateMapper();
        return reader;
    }

    private static ObjectWriter getObjectWriter() {
        if (writer == null) instantiateMapper();
        return writer;
    }
}

// TruthTableGeneratorData.java

package com.apiverve.truthtable.data;

import com.fasterxml.jackson.annotation.*;

public class TruthTableGeneratorData {
    private String expression;
    private String normalized;
    private String[] variables;
    private long variableCount;
    private long rowCount;
    private Row[] rows;
    private String asciiTable;

    @JsonProperty("expression")
    public String getExpression() { return expression; }
    @JsonProperty("expression")
    public void setExpression(String value) { this.expression = value; }

    @JsonProperty("normalized")
    public String getNormalized() { return normalized; }
    @JsonProperty("normalized")
    public void setNormalized(String value) { this.normalized = value; }

    @JsonProperty("variables")
    public String[] getVariables() { return variables; }
    @JsonProperty("variables")
    public void setVariables(String[] value) { this.variables = value; }

    @JsonProperty("variableCount")
    public long getVariableCount() { return variableCount; }
    @JsonProperty("variableCount")
    public void setVariableCount(long value) { this.variableCount = value; }

    @JsonProperty("rowCount")
    public long getRowCount() { return rowCount; }
    @JsonProperty("rowCount")
    public void setRowCount(long value) { this.rowCount = value; }

    @JsonProperty("rows")
    public Row[] getRows() { return rows; }
    @JsonProperty("rows")
    public void setRows(Row[] value) { this.rows = value; }

    @JsonProperty("asciiTable")
    public String getASCIITable() { return asciiTable; }
    @JsonProperty("asciiTable")
    public void setASCIITable(String value) { this.asciiTable = value; }
}

// Row.java

package com.apiverve.truthtable.data;

import com.fasterxml.jackson.annotation.*;

public class Row {
    private Inputs inputs;
    private long result;

    @JsonProperty("inputs")
    public Inputs getInputs() { return inputs; }
    @JsonProperty("inputs")
    public void setInputs(Inputs value) { this.inputs = value; }

    @JsonProperty("result")
    public long getResult() { return result; }
    @JsonProperty("result")
    public void setResult(long value) { this.result = value; }
}

// Inputs.java

package com.apiverve.truthtable.data;

import com.fasterxml.jackson.annotation.*;

public class Inputs {
    private long a;
    private long b;
    private long c;
    private long d;
    private long n;
    private long o;
    private long r;

    @JsonProperty("A")
    public long getA() { return a; }
    @JsonProperty("A")
    public void setA(long value) { this.a = value; }

    @JsonProperty("B")
    public long getB() { return b; }
    @JsonProperty("B")
    public void setB(long value) { this.b = value; }

    @JsonProperty("C")
    public long getC() { return c; }
    @JsonProperty("C")
    public void setC(long value) { this.c = value; }

    @JsonProperty("D")
    public long getD() { return d; }
    @JsonProperty("D")
    public void setD(long value) { this.d = value; }

    @JsonProperty("N")
    public long getN() { return n; }
    @JsonProperty("N")
    public void setN(long value) { this.n = value; }

    @JsonProperty("O")
    public long getO() { return o; }
    @JsonProperty("O")
    public void setO(long value) { this.o = value; }

    @JsonProperty("R")
    public long getR() { return r; }
    @JsonProperty("R")
    public void setR(long value) { this.r = value; }
}