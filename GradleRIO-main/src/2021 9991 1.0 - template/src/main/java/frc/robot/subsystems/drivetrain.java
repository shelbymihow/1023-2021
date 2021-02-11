// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;


public class drivetrain extends CommandBase {
  private static final String constant = null;

  /** Creates our drivetrain subsystem. */
  public drivetrain() {
    //declaring motor controller variables
    Talon leftBackDrive = null;
    Talon leftFrontDrive = null;
    Talon rightFrontDrive = null;
    Talon rightBackDrive = null;

    //set id of talons using global constants from constants.java
    leftBackDrive = new Talon(Constants.LEFT_BACK_DRIVE);
    leftFrontDrive = new Talon(Constants.LEFT_FRONT_DRIVE);
    rightFrontDrive = new Talon(Constants.RIGHT_FRONT_DRIVE);
    rightBackDrive = new Talon(Constants.RIGHT_BACK_DRIVE);

    // Use addRequirements() here to declare subsystem dependencies.
  }
    
  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
