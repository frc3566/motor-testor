// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
//import com.revrobotics.CANSparkMax;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
//import com.revrobotics.CANSparkMaxLowLevel.MotorType;
//import edu.wpi.first.networktables.NetworkTable;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class MotorTestor extends SubsystemBase {
    TalonSRX mLeftMotor;
    TalonSRX mRightMotor;

     public TalonSRX getLeft() {
      return mLeftMotor;
    }

    public TalonSRX getRight() {
      return mRightMotor;
    }

  /** Creates a new ExampleSubsystem. */
  public MotorTestor() {
    mLeftMotor = new TalonSRX(1);
    mRightMotor = new TalonSRX(2);
  }

  /**
   * Example command factory method.
   *
   * @return a command
   */

   public void updateDashboard(){
    SmartDashboard.putNumber("Test Motor Current", mLeftMotor.getOutputCurrent());
    SmartDashboard.putNumber("Test Motor Voltage", mRightMotor.getMotorOutputVoltage());
  
   }
  public CommandBase exampleMethodCommand() {
    return runOnce(
        () -> {
          /* one-time action goes here */
        });
  }

  /**
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public boolean exampleCondition() {
    // Query some boolean state, such as a digital sensor.
    return false;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
