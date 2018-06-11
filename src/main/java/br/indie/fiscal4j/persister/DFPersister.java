package br.indie.fiscal4j.persister;

import br.indie.fiscal4j.transformers.DFRegistryMatcher;
import org.simpleframework.xml.convert.AnnotationStrategy;
import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.stream.Format;

public class DFPersister extends Persister {

    public DFPersister() {
        super(new AnnotationStrategy(), new DFRegistryMatcher(), new Format(0));
    }
}