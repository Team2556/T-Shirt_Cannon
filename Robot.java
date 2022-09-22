// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

// package edu.wpi.first.wpilibj.examples.mecanumdrive;
package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
// import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
// import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
// import edu.wpi.first.wpilibj.Joystick;
// import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.XboxController;

public class Robot extends TimedRobot {
  private MecanumDrive mDrive;
  XboxController Xbox1 = new XboxController(0);
  XboxController Xbox2 = new XboxController(1);

  @Override
  public void robotInit() {
    WPI_TalonSRX rFMotor = new WPI_TalonSRX(3);
    WPI_TalonSRX lFMotor = new WPI_TalonSRX(2);
    WPI_TalonSRX rRMotor = new WPI_TalonSRX(1);
    WPI_TalonSRX lRMotor = new WPI_TalonSRX(4);

    rFMotor.setInverted(true);
    rRMotor.setInverted(true);

    mDrive = new MecanumDrive(lFMotor, lRMotor, rFMotor, rRMotor);

  }

 
  @Override
  public void robotPeriodic() {}

  @Override
  public void autonomousInit() {

  }

  @Override
  public void autonomousPeriodic() {
    
  }

  @Override
  public void teleopInit() {
    
  }

  @Override
  public void teleopPeriodic() {
    mDrive.driveCartesian(Xbox1.getLeftY(), Xbox1.getLeftX(), Xbox1.getRightX());
  }

  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}
 
  @Override
  public void testInit() {
    

  }
  double testHoodValue = 0;
  @Override
  public void testPeriodic() {
    
  }
  
}


