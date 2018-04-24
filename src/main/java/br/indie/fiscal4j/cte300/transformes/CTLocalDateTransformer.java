package br.indie.fiscal4j.cte300.transformes;

import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.simpleframework.xml.transform.Transform;

import java.text.SimpleDateFormat;

class CTLocalDateTransformer implements Transform<LocalDate> {
    private static final SimpleDateFormat SIMPLE_DATE_FORMATTER = new SimpleDateFormat("yyyy-MM-ddXXX");
    private static final DateTimeFormatter DATETIME_FORMATTER = DateTimeFormat.forPattern("yyyy-MM-dd");

    @Override
    public LocalDate read(final String data) throws Exception {
        try {
            return LocalDate.parse(data, CTLocalDateTransformer.DATETIME_FORMATTER);
        } catch (final IllegalArgumentException e) {
            return LocalDate.fromDateFields(CTLocalDateTransformer.SIMPLE_DATE_FORMATTER.parse(data));
        }
    }

    @Override
    public String write(final LocalDate data) throws Exception {
        return CTLocalDateTransformer.DATETIME_FORMATTER.print(data);
    }
}