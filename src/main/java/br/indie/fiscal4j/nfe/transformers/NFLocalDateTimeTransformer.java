package br.indie.fiscal4j.nfe.transformers;

import org.joda.time.LocalDateTime;
import org.simpleframework.xml.transform.Transform;

import java.text.SimpleDateFormat;

class NFLocalDateTimeTransformer implements Transform<LocalDateTime> {

    private static final SimpleDateFormat DATETIME_FORMATTER = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");

    @Override
    public LocalDateTime read(final String data) throws Exception {
        return LocalDateTime.fromDateFields(NFLocalDateTimeTransformer.DATETIME_FORMATTER.parse(data));
    }

    @Override
    public String write(final LocalDateTime data) throws Exception {
        return NFLocalDateTimeTransformer.DATETIME_FORMATTER.format(data.toDate());
    }
}