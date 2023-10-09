package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.IntakeSubsystem;
import frc.robot.subsystems.IntakeConstants;


public class IntakeCommand {
    private final IntakeSubsystem intakeSubsystem;
    private final boolean open;
    
    public IntakeCommand(IntakeSubsystem intakeSubsystem, boolean open) {
        this.intakeSubsystem = intakeSubsystem;
        this.open = open;
        addRequirements(intakeSubsystem);
    }
   
    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
      intakeSubsystem.setMotor(speed);
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
      intakeSubsystem.setMotor(IntakeConstants.INTAKE_STALL_SPEED);
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
      return false;
    }
}
