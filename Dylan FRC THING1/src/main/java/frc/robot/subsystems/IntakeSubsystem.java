package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.IntakeConstants;


import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;


public class IntakeSubsystem {
  private final CANSparkMax intakeMotor = new CANSparkMax(IntakeConstants.INTAKE_MOTOR, MotorType.kBrushless);

    public IntakeSubsystem() {
    }
  
    @Override
    public void periodic() {
      // This method will be called once per scheduler run
    }
  
    public void setMotor(double speed) {
      intake.set(speed);
    }
}
