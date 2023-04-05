// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.Drive;

import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.kinematics.SwerveDriveKinematics;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.Constants.SwerveConstants;
import frc.robot.Constants.SwerveModuleConstants;
import frc.robot.Constants.RobotConstants;

public class DrivebaseSubsystem extends SubsystemBase {
  /** Creates a new DrivebaseSubsystem. */

  private final SwerveModule[] swerveModules;

  // Creating my kinematics object using the module locations from Constants
  private SwerveDriveKinematics m_kinematics;

  public DrivebaseSubsystem() {

    swerveModules = new SwerveModule[] {
      new SwerveModule(SwerveConstants.swerve0.rotateMotorID, SwerveConstants.swerve0.speedMotorID, SwerveConstants.swerve0.canCoderID, 0),
      new SwerveModule(SwerveConstants.swerve1.rotateMotorID, SwerveConstants.swerve1.speedMotorID, SwerveConstants.swerve1.canCoderID, 1),
      new SwerveModule(SwerveConstants.swerve2.rotateMotorID, SwerveConstants.swerve2.speedMotorID, SwerveConstants.swerve2.canCoderID, 2),
      new SwerveModule(SwerveConstants.swerve3.rotateMotorID, SwerveConstants.swerve3.speedMotorID, SwerveConstants.swerve3.canCoderID, 3),
    };
    m_kinematics = new SwerveDriveKinematics(SwerveConstants.swerve0.location, SwerveConstants.swerve1.location, SwerveConstants.swerve2.location, SwerveConstants.swerve3.location); 
  }

  public SwerveDriveKinematics getSwerveDriveKinematics() {
    return m_kinematics;
  }

  public SwerveModule[] getSwerveModules() {
    return swerveModules;
  }

  public SwerveModule getSwerveModule(int index) {
    return swerveModules[index];
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
