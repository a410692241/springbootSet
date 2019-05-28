package runmodule.conditional.bo;

import lombok.Data;

import java.util.Date;
@Data
public class Encoding {
    private String codingType;
    private Date date;

    public Encoding(String codingType) {
        this.codingType = codingType;
    }
}
