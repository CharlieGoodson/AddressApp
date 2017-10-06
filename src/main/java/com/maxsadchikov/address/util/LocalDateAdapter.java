package com.maxsadchikov.address.util;

import java.time.LocalDate;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * Адаптер (для JAXB) для преобразования между типом LocalDate и строковым
 * представлением даты в стандарте ISO 8601, например как '2012-12-03'.
 *
 * @author Marco Jakob
 */
public class LocalDateAdapter extends XmlAdapter {

    @Override
    public LocalDate unmarshal(Object v) throws Exception {
        return LocalDate.parse((String) v);
    }

    @Override
    public String marshal(Object v) throws Exception {
        return v.toString();
    }
}