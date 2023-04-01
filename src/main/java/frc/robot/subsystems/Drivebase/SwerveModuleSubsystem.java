// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.Drivebase;

import com.ctre.phoenix.sensors.CANCoder;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class SwerveModuleSubsystem extends SubsystemBase {
  /** Creates a new SwerveModuleSubsystem. */
  private CANSparkMax rotateMotor;
  private CANSparkMax speedMotor;
  private CANCoder canCoder;

  public SwerveModuleSubsystem(int rID, int sID, int eID) {
      rotateMotor = new CANSparkMax(rID, MotorType.kBrushless);
      speedMotor = new CANSparkMax(sID, MotorType.kBrushless);

      canCoder = new CANCoder(eID);
  }

  public void setSwerveModuleState(double rotatePower, double speedPower, double angle) {
    
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
