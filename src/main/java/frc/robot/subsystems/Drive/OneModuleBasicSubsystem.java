// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.Drive;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class OneModuleBasicSubsystem extends SubsystemBase {
  /** Creates a new OneModuleBasicSubsystem. */
  private CANSparkMax drive;
  private CANSparkMax turn;
  
  public OneModuleBasicSubsystem() {
    drive = new CANSparkMax(6, MotorType.kBrushless);
    turn = new CANSparkMax(5, MotorType.kBrushless);
  }

  public void setDrive(double speed) {
    drive.set(speed);
  }

  public void setTurn(double speed ) {
    turn.set(speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
