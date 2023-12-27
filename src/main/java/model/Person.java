package model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Person {
    private String firstName="Tom",lastName="Jerry";
    private int age=100;

    public int hashCode(){
        return HashCodeBuilder.reflectionHashCode(this);
    }

    public boolean equals(Object obj){
        return EqualsBuilder.reflectionEquals(this,obj);
    }

    public String toString(){
        return ToStringBuilder.reflectionToString(this);
    }
}
