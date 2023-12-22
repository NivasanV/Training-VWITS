import { render, screen } from "@testing-library/react"
import Hello from "./Hello"

describe("Hello Tests render correctly", () => {
    test('Hello renders correctly', () => {
        render(<Hello />);
        const hello = screen.getByText('Welcome');
        expect(hello).toBeInTheDocument();
    })

    test('Hello renders name correctly with is pass via property', () => {
        render(<Hello name="Pranav" />);
        const name = screen.getByText('Pranav');
        expect(name).toBeInTheDocument();
    })
})

describe("Hello Tests render incorrectly", () => {
    test('Hello renders correctly', () => {
        render(<Hello />);
        const hello = screen.getByText('Welcome');
        expect(hello).toBeInTheDocument();
    })

    test('Hello renders name correctly with is pass via property', () => {
        render(<Hello name="Pranav" />);
        const name = screen.getByText('Pranav');
        expect(name).toBeInTheDocument();
    })
})