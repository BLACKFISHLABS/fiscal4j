package br.indie.fiscal4j.parsers;

import br.indie.fiscal4j.classes.evento.cancelamento.NFEnviaEventoCancelamento;
import br.indie.fiscal4j.classes.evento.cartacorrecao.NFEnviaEventoCartaCorrecao;
import br.indie.fiscal4j.classes.evento.inutilizacao.NFEnviaEventoInutilizacao;
import br.indie.fiscal4j.classes.lote.envio.NFLoteEnvio;
import br.indie.fiscal4j.classes.nota.NFNota;
import br.indie.fiscal4j.classes.nota.NFNotaInfoItem;
import br.indie.fiscal4j.classes.nota.NFNotaProcessada;
import br.indie.fiscal4j.persister.NFPersister;
import org.simpleframework.xml.core.Persister;

import java.io.File;

public class NotaParser {

    private final Persister persister;

    public NotaParser() {
        this.persister = new NFPersister();
    }

    public NFNota notaParaObjeto(final File xml) {
        try {
            return this.persister.read(NFNota.class, xml);
        } catch (final Exception e) {
            throw new IllegalArgumentException(String.format("Nao foi possivel parsear o xml: %s", e.getMessage()));
        }
    }

    public NFNota notaParaObjeto(final String xml) {
        try {
            return this.persister.read(NFNota.class, xml);
        } catch (final Exception e) {
            throw new IllegalArgumentException(String.format("Nao foi possivel parsear o xml: %s", e.getMessage()));
        }
    }

    public NFLoteEnvio loteParaObjeto(final File xml) {
        try {
            return this.persister.read(NFLoteEnvio.class, xml);
        } catch (final Exception e) {
            throw new IllegalArgumentException(String.format("Nao foi possivel parsear o xml: %s", e.getMessage()));
        }
    }

    public NFLoteEnvio loteParaObjeto(final String xml) {
        try {
            return this.persister.read(NFLoteEnvio.class, xml);
        } catch (final Exception e) {
            throw new IllegalArgumentException(String.format("Nao foi possivel parsear o xml: %s", e.getMessage()));
        }
    }

    public NFNotaProcessada notaProcessadaParaObjeto(final String xml) {
        try {
            return this.persister.read(NFNotaProcessada.class, xml);
        } catch (final Exception e) {
            throw new IllegalArgumentException(String.format("Nao foi possivel parsear o xml: %s", e.getMessage()));
        }
    }

    public NFNotaProcessada notaProcessadaParaObjeto(final File xml) {
        try {
            return this.persister.read(NFNotaProcessada.class, xml);
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

    public NFNotaInfoItem notaInfoItemParaObjeto(final String xml) {
        try {
            return this.persister.read(NFNotaInfoItem.class, xml);
        } catch (final Exception e) {
            throw new IllegalArgumentException(String.format("Nao foi possivel parsear o xml: %s", e.getMessage()));
        }
    }
}
