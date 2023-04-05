// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.math.geometry.Translation2d;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */


import edu.wpi.first.math.util.Units;

public final class Constants {
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }

  public static class RobotConstants {
    public static final double LENGTH = Units.inchesToMeters(27.0);
    public static final double WIDTH = Units.inchesToMeters(27.0);
  }

  public static class SwerveConstants {

    //Not sure how to calculate this theoretically but this needs to be determined experimentally first
    public static double maxSpeed = 5.0;

    /*
    * IMPORTANT: THIS WAS FOUND THROUGH CAD FILES BUT THERE ARE MANY SWERVE X CONFIGURATIONS
    * SO YOU NEED TO DOUBLE CHECK THIS IS CORRECT IN PRACTICE
    */

    /* ANGLE MOTOR
    * NEO Shaft to 12T Pulley to 24T Pulley to 14T Gear to 72T Main Rotation Gear
    */
    public static double gearRatioAngleMotor = (double) 12.0/24.0*14.0/72.0;

    /* DRIVE MOTOR
     * NEO shaft to 12T Pulley to 24T Pulley to 24T Gear to 22T Gear to 15T bevel to 45T Bevel
     * 
     * The CANCODER measures rotations of a the driven 1:1 PULLEY in which the driver pulley is on the same 
     * shaft as the 24T Pulley
     */
    public static double gearRatioSpeedMotor = (double) 12.0/24.0* 24.0/22.0 * 15.0/45.0;
    /*
     * So Number of Rotations of this CANCOder sensor measured means this amount of rotations in actual SPEED wheel
     */
    public static double gearRatioCANCoder = (double) 24.0/22.0 * 15.0/45.0;

    public static double wheelDiameter = Units.inchesToMeters(4.0);
    public static double wheelCircumfrence = wheelDiameter * 2 * Math.PI;

    public static final double anglekP = 0.6;

    public static final SwerveModuleConstants swerve0 = new SwerveModuleConstants(
      0, 0, 0, new Translation2d(RobotConstants.LENGTH, RobotConstants.LENGTH) );
    public static final SwerveModuleConstants swerve1 = new SwerveModuleConstants(
      0, 0, 0, new Translation2d(RobotConstants.LENGTH, -RobotConstants.LENGTH));
    public static final SwerveModuleConstants swerve2 = new SwerveModuleConstants(
      0, 0, 0, new Translation2d(-RobotConstants.LENGTH, RobotConstants.LENGTH));
    public static final SwerveModuleConstants swerve3 = new SwerveModuleConstants(
      0, 0, 0, new Translation2d(-RobotConstants.LENGTH, -RobotConstants.LENGTH));
  }

  public static class SwerveModuleConstants {
    public int speedMotorID;
    public int rotateMotorID;
    public int canCoderID;

    public Translation2d location;

    public SwerveModuleConstants(int speedMotorID, int rotateMotorID, int canCoderID, Translation2d location) {
      this.speedMotorID = speedMotorID;
      this.rotateMotorID = rotateMotorID;
      this.canCoderID = canCoderID;
      this.location = location;
    }
  }
}
