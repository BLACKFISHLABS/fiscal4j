package br.indie.fiscal4j.nfe.parsers;

import br.indie.fiscal4j.nfe.classes.evento.cancelamento.NFEnviaEventoCancelamento;
import br.indie.fiscal4j.nfe.classes.evento.cartacorrecao.NFEnviaEventoCartaCorrecao;
import br.indie.fiscal4j.nfe.classes.evento.inutilizacao.NFEnviaEventoInutilizacao;
import br.indie.fiscal4j.nfe.classes.lote.envio.DFLoteEnvio;
import br.indie.fiscal4j.nfe.classes.nota.DFNota;
import br.indie.fiscal4j.nfe.classes.nota.DFNotaInfoItem;
import br.indie.fiscal4j.nfe.classes.nota.DFNotaProcessada;
import br.indie.fiscal4j.nfe.persister.NFPersister;
import org.simpleframework.xml.core.Persister;

import java.io.File;

public class NotaParser {

    private final Persister persister;

    public NotaParser() {
        this.persister = new NFPersister();
    }

    public DFNota notaParaObjeto(final File xml) {
        try {
            return this.persister.read(DFNota.class, xml);
        } catch (final Exception e) {
            throw new IllegalArgumentException(String.format("Nao foi possivel parsear o xml: %s", e.getMessage()));
        }
    }

    public DFNota notaParaObjeto(final String xml) {
        try {
            return this.persister.read(DFNota.class, xml);
        } catch (final Exception e) {
            throw new IllegalArgumentException(String.format("Nao foi possivel parsear o xml: %s", e.getMessage()));
        }
    }

    public DFLoteEnvio loteParaObjeto(final File xml) {
        try {
            return this.persister.read(DFLoteEnvio.class, xml);
        } catch (final Exception e) {
            throw new IllegalArgumentException(String.format("Nao foi possivel parsear o xml: %s", e.getMessage()));
        }
    }

    public DFLoteEnvio loteParaObjeto(final String xml) {
        try {
            return this.persister.read(DFLoteEnvio.class, xml);
        } catch (final Exception e) {
            throw new IllegalArgumentException(String.format("Nao foi possivel parsear o xml: %s", e.getMessage()));
        }
    }

    public DFNotaProcessada notaProcessadaParaObjeto(final String xml) {
        try {
            return this.persister.read(DFNotaProcessada.class, xml);
        } catch (final Exception e) {
            throw new IllegalArgumentException(String.format("Nao foi possivel parsear o xml: %s", e.getMessage()));
        }
    }

    public DFNotaProcessada notaProcessadaParaObjeto(final File xml) {
        try {
            return this.persister.read(DFNotaProcessada.class, xml);
        } catch (final Exception e) {
            throw new IllegalArgumentException(String.format("Nao foi possivel parsear o xml: %s", e.getMessage()));
        }
    }

    public NFEnviaEventoCartaCorrecao enviaEventoCartaCorrecaoParaObjeto(final File xml) {
        try {
            return this.persister.read(NFEnviaEventoCartaCorrecao.class, xml);
        } catch (final Exception e) {
            throw new IllegalArgumentException(String.format("Nao foi possivel parsear o xml: %s", e.getMessage()));
        }
    }

    public NFEnviaEventoCartaCorrecao enviaEventoCartaCorrecaoParaObjeto(final String xml) {
        try {
            return this.persister.read(NFEnviaEventoCartaCorrecao.class, xml);
        } catch (final Exception e) {
            throw new IllegalArgumentException(String.format("Nao foi possivel parsear o xml: %s", e.getMessage()));
        }
    }

    public NFEnviaEventoCancelamento enviaEventoCancelamentoParaObjeto(final File xml) {
        try {
            return this.persister.read(NFEnviaEventoCancelamento.class, xml);
        } catch (final Exception e) {
            throw new IllegalArgumentException(String.format("Nao foi possivel parsear o xml: %s", e.getMessage()));
        }
    }

    public NFEnviaEventoCancelamento enviaEventoCancelamentoParaObjeto(final String xml) {
        try {
            return this.persister.read(NFEnviaEventoCancelamento.class, xml);
        } catch (final Exception e) {
            throw new IllegalArgumentException(String.format("Nao foi possivel parsear o xml: %s", e.getMessage()));
        }
    }

    public NFEnviaEventoInutilizacao enviaEventoInutilizacaoParaObjeto(final File xml) {
        try {
            return this.persister.read(NFEnviaEventoInutilizacao.class, xml);
        } catch (final Exception e) {
            throw new IllegalArgumentException(String.format("Nao foi possivel parsear o xml: %s", e.getMessage()));
        }
    }

    public NFEnviaEventoInutilizacao enviaEventoInutilizacaoParaObjeto(final String xml) {
        try {
            return this.persister.read(NFEnviaEventoInutilizacao.class, xml);
        } catch (final Exception e) {
            throw new IllegalArgumentException(String.format("Nao foi possivel parsear o xml: %s", e.getMessage()));
        }
    }

    public DFNotaInfoItem notaInfoItemParaObjeto(final String xml) {
        try {
            return this.persister.read(DFNotaInfoItem.class, xml);
        } catch (final Exception e) {
            throw new IllegalArgumentException(String.format("Nao foi possivel parsear o xml: %s", e.getMessage()));
        }
    }
}
