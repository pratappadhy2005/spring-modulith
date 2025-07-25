package com.javatechie.smartparking_system.allocation;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
public class Slot {
    // Represents a parking slot in the system
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;
    private String slotCode;//A1,B1,C1 etc.
    private boolean available;
    private String vehicleNumber; // optional (for tracking allocation)
}
