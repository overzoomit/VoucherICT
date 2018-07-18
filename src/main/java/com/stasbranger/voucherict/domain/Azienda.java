package com.stasbranger.voucherict.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.validation.constraints.*;

import java.io.Serializable;
import java.util.Objects;

/**
 * A Azienda.
 */
@Document(collection = "azienda")
@org.springframework.data.elasticsearch.annotations.Document(indexName = "azienda")
public class Azienda implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @NotNull
    @Field("ragione_sociale")
    private String ragioneSociale;

    @Field("partita_iva")
    private String partitaIva;

    @Field("regione")
    private String regione;

    @Field("codice")
    private String codice;
    
    @Field("voucher_assegnato")
    private Double voucherAssegnato;
    
    @Field("cup")
    private String cup;
    
    @Field("rna")
    private String rna;
    
    @Field("citta")
    private String citta;
    
    @Field("provincia")
    private String provincia;
    
    @Field("cap")
    private String cap;
    
    @Field("indirizzo")
    private String indirizzo;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRagioneSociale() {
        return ragioneSociale;
    }

    public Azienda ragioneSociale(String ragioneSociale) {
        this.ragioneSociale = ragioneSociale;
        return this;
    }

    public void setRagioneSociale(String ragioneSociale) {
        this.ragioneSociale = ragioneSociale;
    }

    public String getPartitaIva() {
        return partitaIva;
    }

    public Azienda partitaIva(String partitaIva) {
        this.partitaIva = partitaIva;
        return this;
    }

    public void setPartitaIva(String partitaIva) {
        this.partitaIva = partitaIva;
    }

    public String getRegione() {
        return regione;
    }

    public Azienda regione(String regione) {
        this.regione = regione;
        return this;
    }

    public void setRegione(String regione) {
        this.regione = regione;
    }

    public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public Double getVoucherAssegnato() {
		return voucherAssegnato;
	}

	public void setVoucherAssegnato(Double voucherAssegnato) {
		this.voucherAssegnato = voucherAssegnato;
	}

	public String getCup() {
		return cup;
	}

	public void setCup(String cup) {
		this.cup = cup;
	}

	public String getRna() {
		return rna;
	}

	public void setRna(String rna) {
		this.rna = rna;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getCap() {
		return cap;
	}

	public void setCap(String cap) {
		this.cap = cap;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Azienda azienda = (Azienda) o;
        if (azienda.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), azienda.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
	public String toString() {
		return "Azienda [id=" + id + ", ragioneSociale=" + ragioneSociale + ", partitaIva=" + partitaIva + ", regione="
				+ regione + ", codice=" + codice + ", voucherAssegnato=" + voucherAssegnato + ", cup=" + cup + ", rna="
				+ rna + ", citta=" + citta + "]";
	}
}
