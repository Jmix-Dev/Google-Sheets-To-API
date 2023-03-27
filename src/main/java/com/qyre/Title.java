
package com.qyre;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "local",
        "en",
        "int"
})
@Generated("jsonschema2pojo")
public class Title {

    @JsonProperty("local")
    private String local;
    @JsonProperty("en")
    private String en;
    @JsonProperty("int")
    private String _int;

    /**
     * No args constructor for use in serialization
     */
    public Title() {
    }

    /**
     * @param en
     * @param _int
     * @param local
     */
    public Title(String local, String en, String _int) {
        super();
        this.local = local;
        this.en = en;
        this._int = _int;
    }

    @JsonProperty("local")
    public String getLocal() {
        return local;
    }

    @JsonProperty("local")
    public void setLocal(String local) {
        this.local = local;
    }

    @JsonProperty("en")
    public String getEn() {
        return en;
    }

    @JsonProperty("en")
    public void setEn(String en) {
        this.en = en;
    }

    @JsonProperty("int")
    public String getInt() {
        return _int;
    }

    @JsonProperty("int")
    public void setInt(String _int) {
        this._int = _int;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Title.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("local");
        sb.append('=');
        sb.append(((this.local == null) ? "<null>" : this.local));
        sb.append(',');
        sb.append("en");
        sb.append('=');
        sb.append(((this.en == null) ? "<null>" : this.en));
        sb.append(',');
        sb.append("_int");
        sb.append('=');
        sb.append(((this._int == null) ? "<null>" : this._int));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result * 31) + ((this.en == null) ? 0 : this.en.hashCode()));
        result = ((result * 31) + ((this._int == null) ? 0 : this._int.hashCode()));
        result = ((result * 31) + ((this.local == null) ? 0 : this.local.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Title) == false) {
            return false;
        }
        Title rhs = ((Title) other);
        return ((((this.en == rhs.en) || ((this.en != null) && this.en.equals(rhs.en))) && ((this._int == rhs._int) || ((this._int != null) && this._int.equals(rhs._int)))) && ((this.local == rhs.local) || ((this.local != null) && this.local.equals(rhs.local))));
    }

}
