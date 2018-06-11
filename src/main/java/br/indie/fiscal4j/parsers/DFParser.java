package br.indie.fiscal4j.parsers;

import br.indie.fiscal4j.cte300.classes.enviolote.CTeEnvioLote;
import br.indie.fiscal4j.cte300.classes.nota.CTeProcessado;
import br.indie.fiscal4j.mdfe3.classes.lote.envio.MDFEnvioLote;
import br.indie.fiscal4j.nfe400.classes.evento.cancelamento.NFEnviaEventoCancelamento;
import br.indie.fiscal4j.nfe400.classes.evento.cartacorrecao.NFEnviaEventoCartaCorrecao;
import br.indie.fiscal4j.nfe400.classes.evento.inutilizacao.NFEnviaEventoInutilizacao;
import br.indie.fiscal4j.nfe400.classes.lote.envio.NFLoteEnvio;
import br.indie.fiscal4j.nfe400.classes.nota.NFNota;
import br.indie.fiscal4j.nfe400.classes.nota.NFNotaInfoItem;
import br.indie.fiscal4j.nfe400.classes.nota.NFNotaProcessada;
import br.indie.fiscal4j.persister.DFPersister;
import org.simpleframework.xml.core.Persister;

import java.io.File;

public class DFParser {

    private final Persister persister;

    public DFParser() {
        this.persister = new DFPersister();
    }

    // NFe/NFCe
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

    //CTe
    public CTeEnvioLote cteRecepcaoParaObjeto(final String xml) {
        try {
            return this.persister.read(CTeEnvioLote.class, xml);
        } catch (final Exception e) {
            throw new IllegalArgumentException(String.format("Nao foi possivel parsear o xml: %s", e.getMessage()));
        }
    }


    public CTeProcessado cteProcessadoParaObjeto(final String xml) {
        try {
            return this.persister.read(CTeProcessado.class, xml);
        } catch (final Exception e) {
            throw new IllegalArgumentException(String.format("Nao foi possivel parsear o xml: %s", e.getMessage()));
        }
    }

    //MDFe
    public MDFEnvioLote mdfeRecepcaoParaObjeto(final String xml) {
        try {
            return this.persister.read(MDFEnvioLote.class, xml);
        } catch (final Exception e) {
            throw new IllegalArgumentException(String.format("Nao foi possivel parsear o xml do Lote MDFe: %s", e.getMessage()));
        }
    }

}
