package br.indie.fiscal4j.nfe.classes.nota;

import br.indie.fiscal4j.common.DFBase;
import br.indie.fiscal4j.nfe.classes.NFNotaInfoSituacaoTributariaCOFINS;
import org.simpleframework.xml.Element;

public class DFNotaInfoItemImpostoCOFINSNaoTributavel extends DFBase {

    @Element(name = "CST", required = true)
    private NFNotaInfoSituacaoTributariaCOFINS situacaoTributaria;

    public DFNotaInfoItemImpostoCOFINSNaoTributavel() {
        this.situacaoTributaria = null;
    }

    public void setSituacaoTributaria(final NFNotaInfoSituacaoTributariaCOFINS situacaoTributaria) {
        if (!NFNotaInfoSituacaoTributariaCOFINS.OPERACAO_TRIBUTAVEL_MONOFASICA_ALIQUOTA_ZERO.equals(situacaoTributaria) && !NFNotaInfoSituacaoTributariaCOFINS.OPERACAO_TRIBUTAVEL_ALIQUOTA_ZERO.equals(situacaoTributaria) && !NFNotaInfoSituacaoTributariaCOFINS.OPERACAO_ISENTA_CONTRIBUICAO.equals(situacaoTributaria) && !NFNotaInfoSituacaoTributariaCOFINS.OPERACAO_SEM_INCIDENCIA_CONTRIBUICAO.equals(situacaoTributaria) && !NFNotaInfoSituacaoTributariaCOFINS.OPERACAO_COM_SUSPENSAO_CONTRIBUICAO.equals(situacaoTributaria)) {
            throw new IllegalStateException("Situacao tributaria invalido");
        }
        this.situacaoTributaria = situacaoTributaria;
    }

    public NFNotaInfoSituacaoTributariaCOFINS getSituacaoTributaria() {
        return this.situacaoTributaria;
    }
}