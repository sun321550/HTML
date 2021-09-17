package bean;

import java.io.Serializable;

/**
 * t_business
 * @author 
 */
public class TBusiness implements Serializable {
    private Integer bid;

    private String bname;

    private String btype;

    private String bmark;

    private static final long serialVersionUID = 1L;

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getBtype() {
        return btype;
    }

    public void setBtype(String btype) {
        this.btype = btype;
    }

    public String getBmark() {
        return bmark;
    }

    public void setBmark(String bmark) {
        this.bmark = bmark;
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
        TBusiness other = (TBusiness) that;
        return (this.getBid() == null ? other.getBid() == null : this.getBid().equals(other.getBid()))
            && (this.getBname() == null ? other.getBname() == null : this.getBname().equals(other.getBname()))
            && (this.getBtype() == null ? other.getBtype() == null : this.getBtype().equals(other.getBtype()))
            && (this.getBmark() == null ? other.getBmark() == null : this.getBmark().equals(other.getBmark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBid() == null) ? 0 : getBid().hashCode());
        result = prime * result + ((getBname() == null) ? 0 : getBname().hashCode());
        result = prime * result + ((getBtype() == null) ? 0 : getBtype().hashCode());
        result = prime * result + ((getBmark() == null) ? 0 : getBmark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bid=").append(bid);
        sb.append(", bname=").append(bname);
        sb.append(", btype=").append(btype);
        sb.append(", bmark=").append(bmark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}