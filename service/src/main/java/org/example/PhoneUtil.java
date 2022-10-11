package org.example;

public class PhoneUtil {
    public static String getFullNumber(Phone phone) {
        return phone.getPrefix() + phone.getNumber();
    }
    public static String getPhoneWithCode(Phone phone) {
        String code = phone.getBonusCode();
        String bonusCode = code == null ? "" : "#" + code;
        return phone.getPrefix() + phone.getNumber() + bonusCode;
    }
}
