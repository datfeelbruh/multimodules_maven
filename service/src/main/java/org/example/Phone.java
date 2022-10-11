package org.example;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.NonNull;

@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Phone {
    @NonNull
    private final String prefix;
    @NonNull
    private final String number;
    private final String bonusCode;
}
