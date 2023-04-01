// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.Drivebase;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DrivebaseSubsystem extends SubsystemBase {
  /** Creates a new DrivebaseSubsystem. */
  
  SwerveModuleSubsystem frontLeft;
  SwerveModuleSubsystem frontRight;
  SwerveModuleSubsystem backLeft;
  SwerveModuleSubsystem backRight;

  public DrivebaseSubsystem()
  {
    frontLeft = new SwerveModuleSubsystem(Constants.SwerveModuleConstants.backLeftDrive, Constants.SwerveModuleConstants.backLeftRotate, 0);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
