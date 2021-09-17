package bean;

import java.io.Serializable;

/**
 * t_detail
 * @author 
 */
public class TDetail implements Serializable {
    private Integer bdid;

    private Integer bid;

    private String bdname;

    private String bdperson;

    private static final long serialVersionUID = 1L;

    public Integer getBdid() {
        return bdid;
    }

    public void setBdid(Integer bdid) {
        this.bdid = bdid;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getBdname() {
        return bdname;
    }

    public void setBdname(String bdname) {
        this.bdname = bdname;
    }

    public String getBdperson() {
        return bdperson;
    }

    public void setBdperson(String bdperson) {
        this.bdperson = bdperson;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TDetail other = (TDetail) that;
        return (this.getBdid() == null ? other.getBdid() == null : this.getBdid().equals(other.getBdid()))
            && (this.getBid() == null ? other.getBid() == null : this.getBid().equals(other.getBid()))
            && (this.getBdname() == null ? other.getBdname() == null : this.getBdname().equals(other.getBdname()))
            && (this.getBdperson() == null ? other.getBdperson() == null : this.getBdperson().equals(other.getBdperson()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBdid() == null) ? 0 : getBdid().hashCode());
        result = prime * result + ((getBid() == null) ? 0 : getBid().hashCode());
        result = prime * result + ((getBdname() == null) ? 0 : getBdname().hashCode());
        result = prime * result + ((getBdperson() == null) ? 0 : getBdperson().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bdid=").append(bdid);
        sb.append(", bid=").append(bid);
        sb.append(", bdname=").append(bdname);
        sb.append(", bdperson=").append(bdperson);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}