package org.example;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Runner {
    public static void main(String[] args) {
        Phone phone = new Phone("+7", "00000023");
        Phone phoneWithBonusCode = new Phone("+7", "00000023", "007");
        Phone phoneWithBonusCodeEqNull = new Phone("+7", "00000023", null);

        log.info(PhoneUtil.getFullNumber(phone));
        log.info(PhoneUtil.getPhoneWithCode(phoneWithBonusCode));
        log.info(PhoneUtil.getPhoneWithCode(phoneWithBonusCodeEqNull));
    }
}
