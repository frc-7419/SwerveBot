// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.Drive;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;


public class RunOneModule extends CommandBase {
 

  /** Creates a new RunOneModule. */
  OneModuleBasicSubsystem module;
  XboxController joystick;
  public RunOneModule(OneModuleBasicSubsystem module, XboxController joystick ) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.module = module;
    this.joystick = joystick;
    addRequirements(module);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
   
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (joystick.getLeftY() > 0) {
      module.setDrive(joystick.getLeftY());
    }
    if (joystick.getRightX() > 0) {
      module.setTurn(joystick.getRightX());
    }
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
