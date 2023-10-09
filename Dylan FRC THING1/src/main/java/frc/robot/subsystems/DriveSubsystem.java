package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DriveConstants;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

public class DriveSubsystem extends SubsystemBase{
    private final WPI_VictorSPX driveFrontLeft = new WPI_VictorSPX(DriveConstants.DRIVE_FRONT_LEFT);
    private final WPI_VictorSPX driveFrontRight = new WPI_VictorSPX(DriveConstants.DRIVE_FRONT_RIGHT);
    private final WPI_VictorSPX driveBackLeft = new WPI_VictorSPX(DriveConstants.DRIVE_BACK_LEFT);
    private final WPI_VictorSPX driveBackRight = new WPI_VictorSPX(DriveConstants.DRIVE_BACK_RIGHT);

    private final MotorControllerGroup driveLeft = new MotorControllerGroup(driveFrontLeft, driveBackLeft);
    private final MotorControllerGroup driveRight = new MotorControllerGroup(driveFrontRight, driveBackRight);
    private final DifferentialDrive driveRobot = new DifferentialDrive(driveLeft, driveRight);

    public void setMotor(double forwardSpeed, double turnSpeed) {
        driveRobot.arcadeDrive(forwardSpeed, turnSpeed);
    }
}
