// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.Gyro;
import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class GyroSubsystem extends SubsystemBase {
  /** Creates a new DriveBaseSubsystem. */
  private AHRS navX;

  public GyroSubsystem() {
    navX = new AHRS(SPI.Port.kMXP);
    navX.reset();
  }

  ///public wrappers for when using these methods from other files
  public Rotation2d getRotation2d() { return navX.getRotation2d(); } //be careful degrees>360 stay that way!

  public double getDegrees() { return navX.getAngle(); }

  public double getYaw() { return navX.getYaw(); }

  public double getPitch() { return navX.getPitch(); }

  public double getRoll() { return navX.getRoll(); }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    SmartDashboard.putNumber("Yaw", navX.getYaw());
    SmartDashboard.putNumber("Roll", navX.getRoll());
    SmartDashboard.putNumber("Pitch", navX.getPitch());
  }
}
