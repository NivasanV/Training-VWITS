import { render, screen } from '@testing-library/react';
import App from './App';

// test function takes two args, first argument is the user friendly test name
// second args is the arrow function which is the test itself(expectation of the test)
test('renders learn react link', () => {
  render(<App />); // going to render the aoo component
  const linkElement = screen.getByText(/learn react/i);
  expect(linkElement).toBeInTheDocument();
});
