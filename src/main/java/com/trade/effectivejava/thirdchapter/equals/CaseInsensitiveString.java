package com.trade.effectivejava.thirdchapter.equals;

/**
 * Created by tiany on 2017/12/14.
 */
public final class CaseInsensitiveString {
    public final String s;

    public CaseInsensitiveString(String s) {
        if(s == null){
            throw new NullPointerException();
        }
        this.s = s;
    }

    @Override
    public boolean equals(Object obj) {
        /*if(obj instanceof CaseInsensitiveString){
            return s.equalsIgnoreCase(((CaseInsensitiveString) obj).s);
        }
        if(obj instanceof String){
            return s.equalsIgnoreCase((String) obj);
        }
        return false;*/
        return obj instanceof CaseInsensitiveString && ((CaseInsensitiveString) obj).s.equalsIgnoreCase(s);
    }

    public static void main(String[] args) {
        CaseInsensitiveString cis = new CaseInsensitiveString("abc");
        String s = "abc";
        System.out.println(cis.equals(s));
        System.out.println(s.equals(cis));
    }
}
