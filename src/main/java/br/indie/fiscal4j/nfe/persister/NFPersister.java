package br.indie.fiscal4j.nfe.persister;

import br.indie.fiscal4j.nfe.transformers.NFRegistryMatcher;
import org.simpleframework.xml.convert.AnnotationStrategy;
import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.stream.Format;

public class NFPersister extends Persister {

    public NFPersister() {
        super(new AnnotationStrategy(), new NFRegistryMatcher(), new Format(0));
    }
}