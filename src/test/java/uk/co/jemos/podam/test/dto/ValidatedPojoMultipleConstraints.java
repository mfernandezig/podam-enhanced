package uk.co.jemos.podam.test.dto;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * POJO to test multiple constraints attached to the same field
 *
 * @author daivanov
 *
 */
public class ValidatedPojoMultipleConstraints {

    @DecimalMax("100.0")
    @DecimalMin("-100.0")
    @Digits(integer = 1, fraction = 1)
    private Double value;

    @DecimalMax("-0.1")
    @Digits(integer = 1, fraction = 1)
    private Double value2;

    @DecimalMin("0.1")
    @Digits(integer = 1, fraction = 1)
    private Double value3;

    @Size(max = 1, message = "str too long")
    @NotEmpty(message = "str too short")
    private String str;

    @NotNull
    @NotEmpty
    private String str2;

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Double getValue2() {
        return value2;
    }

    public void setValue2(Double value2) {
        this.value2 = value2;
    }

    public Double getValue3() {
        return value3;
    }

    public void setValue3(Double value3) {
        this.value3 = value3;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String getStr2() {
        return str2;
    }

    public void setStr2(String str2) {
        this.str2 = str2;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(this.getClass().getSimpleName());
        sb.append('{');
        sb.append("value='").append(value).append("\',");
        sb.append("value2='").append(value2).append("\',");
        sb.append("value3='").append(value3).append('\'');
        sb.append("str='").append(str).append('\'');
        sb.append("str2='").append(str2).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
