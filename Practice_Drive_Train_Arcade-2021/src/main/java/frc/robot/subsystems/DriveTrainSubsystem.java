/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrainSubsystem extends SubsystemBase {
  /**
   * Creates a new DriveTrainSubsystem.
   */
  public DriveTrainSubsystem() {

    CANSparkMax frontLeft = new CANSparkMax(Constants.FRONT_LEFT_SPARK, MotorType.kBrushed);
    CANSparkMax backLeft = new CANSparkMax(Constants.BACK_LEFT_SPARK, MotorType.kBrushed);
    CANSparkMax frontRight = new CANSparkMax(Constants.FRONT_RIGHT_SPARK, MotorType.kBrushed);
    CANSparkMax backRight = new CANSparkMax(Constants.BACK_RIGHT_SPARK, MotorType.kBrushed);

    frontLeft.setInverted(false);
    backLeft.setInverted(false);
    frontRight.setInverted(true);
    backRight.setInverted(true);

  }

  public void moveLeftTrain(double speed, Object Backend) {

    Object frontLeft;
    ((Object) frontLeft).set(speed);
    ((Object) Backend).set(speed);
    
  }

  public void moveRightTrain( double speed ) {

    Object frontRight;
    frontRight.set(speed);
    Object backRight;
    backRight.set(speed);

  }

  public void arcadeDrive( double X, double Y ) {
    double speed;
    moveLeftTrain(speed, speed);
    moveRightTrain( speed );
  
  }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
