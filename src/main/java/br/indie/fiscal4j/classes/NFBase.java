package br.indie.fiscal4j.classes;

import br.indie.fiscal4j.persister.NFPersister;
import org.simpleframework.xml.core.Persister;

import java.io.StringWriter;

public abstract class NFBase {

    @Override
    public String toString() {
        final Persister persister = new NFPersister();
        try (StringWriter writer = new StringWriter()) {
            persister.write(this, writer);
            return writer.toString();
        } catch (final Exception e) {
            throw new IllegalStateException(e.getMessage(), e);
        }
    }
}