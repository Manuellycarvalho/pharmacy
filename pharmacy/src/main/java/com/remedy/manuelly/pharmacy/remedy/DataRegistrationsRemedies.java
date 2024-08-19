package com.remedy.manuelly.pharmacy.remedy;

public record DataRegistrationsRemedies(
        String name,
        via via,
        String batch,
        String quantity,
        String validity,
        laboratory laboratory
) {
}
