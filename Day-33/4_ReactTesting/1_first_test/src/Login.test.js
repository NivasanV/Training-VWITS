import { render, screen } from "@testing-library/react"
import Login from "./Login"

test('Login username reders with correct class', () => {
    render(<Login />);
    const username = screen.getByLabelText('Username');
    expect(username).toHaveClass('invalid');
})