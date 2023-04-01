// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.Drivebase;

import edu.wpi.first.math.kinematics.ChassisSpeeds;
import edu.wpi.first.wpilibj.XboxController;

/*
 * How will Swerve Work? JY: 2023
 * Joysticks need to output a x/y speed and a rotation theta speed
 * Always REMEMBER Swerve is FIELD-ORIENTED DRIVE
 */

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Gyro.GyroSubsystem;

public class RunSwerveWithJoystick extends CommandBase {
  /** Creates a new RunSwerveWithJoystick. */
  XboxController joystick;
  DrivebaseSubsystem drivebaseSubsystem;
  GyroSubsystem gyroSubsystem;

  public RunSwerveWithJoystick(XboxController joystick, DrivebaseSubsystem drivebaseSubsystem, GyroSubsystem gyroSubsystem) {
    this.joystick = joystick;
    this.drivebaseSubsystem = drivebaseSubsystem;
    this.gyroSubsystem = gyroSubsystem;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(drivebaseSubsystem, gyroSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    
  }

  public void joystickToChassisSpeeds(double x1, double y1, double x2) { //x1, y1 are the drive x2 is the angle

  }

  public void ChassisSpeedstoModules() {

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
