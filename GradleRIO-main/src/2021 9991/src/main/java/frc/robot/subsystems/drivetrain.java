// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;


public class drivetrain extends CommandBase {
    //create methods for individual motor controllers
  Talon leftBackDrive = null;
  Talon leftFrontDrive = null;
  Talon rightFrontDrive = null;
  Talon rightBackDrive = null;

  //create drive method 
  //BEFORE UNCOMMENTING CONFIRM MOTORS ARE WIRED TO SPIN SAME DIRECTION!!
  SpeedControllerGroup leftMotors = null;
  SpeedControllerGroup rightMotors = null;
  DifferentialDrive differentialDrive = null;

  /** Creates our drivetrain subsystem. */

  public drivetrain() {
    //this is the constructor

    //set id of talons using global constants from constants.java
    leftBackDrive = new Talon(Constants.LEFT_BACK_DRIVE);
    leftFrontDrive = new Talon(Constants.LEFT_FRONT_DRIVE);
    rightFrontDrive = new Talon(Constants.RIGHT_FRONT_DRIVE);
    rightBackDrive = new Talon(Constants.RIGHT_BACK_DRIVE);

    //create groups 
    leftMotors = new SpeedControllerGroup(leftBackDrive, leftFrontDrive);
    rightMotors = new SpeedControllerGroup(rightBackDrive, rightFrontDrive);
    
    // Use addRequirements() here to declare subsystem dependencies.
  }

  //now, we will create the arcade drive method from the differential drive
  public void arcadeDrive(double moveSpeed, double rotationSpeed) {
    differentialDrive.arcadeDrive(moveSpeed, rotationSpeed);

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
