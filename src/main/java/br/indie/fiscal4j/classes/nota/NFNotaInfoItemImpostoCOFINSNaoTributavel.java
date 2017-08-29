package br.indie.fiscal4j.classes.nota;

import br.indie.fiscal4j.classes.NFBase;
import br.indie.fiscal4j.classes.NFNotaInfoSituacaoTributariaCOFINS;
import org.simpleframework.xml.Element;

public class NFNotaInfoItemImpostoCOFINSNaoTributavel extends NFBase {

    @Element(name = "CST", required = true)
    private NFNotaInfoSituacaoTributariaCOFINS situacaoTributaria;

    public NFNotaInfoItemImpostoCOFINSNaoTributavel() {
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