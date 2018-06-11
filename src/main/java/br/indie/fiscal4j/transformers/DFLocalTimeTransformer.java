package br.indie.fiscal4j.transformers;

import org.simpleframework.xml.transform.Transform;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DFLocalTimeTransformer implements Transform<LocalTime> {

    @Override
    public LocalTime read(final String time) {
        return LocalTime.from(DateTimeFormatter.ofPattern("HH:mm:ss").parse(time));
    }

    @Override
    public String write(final LocalTime localTime) {
        return DateTimeFormatter.ofPattern("HH:mm:ss").format(localTime);
    }
}