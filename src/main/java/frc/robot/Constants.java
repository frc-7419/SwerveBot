// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }

  public static class RobotConstants {
    public static final double LENGTH = 27*0.0254;
    public static final double WIDTH = 27*0.0254;
  }

  public static class SwerveConstants {

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
     */
    public static double gearRatioSpeedMotor = (double) 12.0/24.0* 24.0/22.0 * 15.0/45.0;

    public static final double anglekP = 0.6;

    public static final SwerveModuleConstants swerve0 = new SwerveModuleConstants(0, 0, 0);
    public static final SwerveModuleConstants swerve1 = new SwerveModuleConstants(0, 0, 0);
    public static final SwerveModuleConstants swerve2 = new SwerveModuleConstants(0, 0, 0);
    public static final SwerveModuleConstants swerve3 = new SwerveModuleConstants(0, 0, 0);
  }

  public static class SwerveModuleConstants {
    public int speedMotorID;
    public int rotateMotorID;
    public int canCoderID;

    public SwerveModuleConstants(int speedMotorID, int rotateMotorID, int canCoderID) {
      this.speedMotorID = speedMotorID;
      this.rotateMotorID = rotateMotorID;
      this.canCoderID = canCoderID;
    }
  }
}
